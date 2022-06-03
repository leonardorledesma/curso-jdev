package thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TelaTimeThread extends JDialog {

    private JPanel jPanel = new JPanel(new GridBagLayout());// painel de componentes

    private JLabel descricaoHora = new JLabel("Time Thread 1");
    private JTextField mostraTempo = new JTextField();

    private JLabel descricaoHora2 = new JLabel("Time Thread 2");
    private JTextField mostraTempo2 = new JTextField();

    private JButton jButton = new JButton("Start");
    private JButton jButton2 = new JButton("Stop");

    private Runnable thread1 = new Runnable(){

        @Override
        public void run() {
            while (true){
                mostraTempo.setText(new SimpleDateFormat("dd/MM/yyy hh:mm.ss")
                        .format(Calendar.getInstance().getTime()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    private Thread thread1Time;




    public TelaTimeThread() {//executa o que estiver dentro no momento da abertura ou execução
        setTitle("Minha tela de time com thread "); //titulo da thread
        setSize(new Dimension(240,240));//dimensão da tela
        setLocationRelativeTo(null); //posição em relação a um objeto
        setResizable(false); // com false não permite redimensionamento da tela
        /* primeira parte concluida*/

        GridBagConstraints gridBagConstraints = new GridBagConstraints();// controlador de posicionamento de componentes
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new Insets(5, 5, 5,5);
        gridBagConstraints.anchor = GridBagConstraints.WEST;

        descricaoHora.setPreferredSize(new Dimension(200,25));
        jPanel.add(descricaoHora, gridBagConstraints);

        mostraTempo.setPreferredSize(new Dimension(200,25));
        gridBagConstraints.gridy ++;
        mostraTempo.setEditable(false);
        jPanel.add(mostraTempo, gridBagConstraints);

        descricaoHora2.setPreferredSize(new Dimension(200,25));
        gridBagConstraints.gridy ++;
        jPanel.add(descricaoHora2, gridBagConstraints);

        mostraTempo2.setPreferredSize(new Dimension(200,25));
        gridBagConstraints.gridy ++;
        mostraTempo2.setEditable(false);
        jPanel.add(mostraTempo2, gridBagConstraints);

        //**********************************************

        gridBagConstraints.gridwidth = 1;

        jButton.setPreferredSize(new Dimension(92,25));
        gridBagConstraints.gridy ++;
        jPanel.add(jButton, gridBagConstraints);

        jButton2.setPreferredSize(new Dimension(92,25));
        //gridBagConstraints.gridy ++;
        gridBagConstraints.gridx ++;
        jPanel.add(jButton2, gridBagConstraints);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //executa o click no botão
                Thread thread1Time = new Thread(thread1);
                thread1Time.start();
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thread1Time.stop();
            }
        });





        add(jPanel, BorderLayout.WEST);
        setVisible(true);// torna a tela visivel para o usuario, sempre será o ultimo comando.
    }


}
