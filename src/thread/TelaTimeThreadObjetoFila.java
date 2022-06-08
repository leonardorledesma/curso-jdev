package thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TelaTimeThreadObjetoFila extends JDialog {

    private JPanel jPanel = new JPanel(new GridBagLayout());// painel de componentes

    private JLabel descricaoHora = new JLabel("Nome");
    private JTextField mostraTempo = new JTextField();

    private JLabel descricaoHora2 = new JLabel("Email");
    private JTextField mostraTempo2 = new JTextField();

    private JButton jButton = new JButton("Add Lista");
    private JButton jButton2 = new JButton("Stop");

    private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

    public TelaTimeThreadObjetoFila() {//executa o que estiver dentro no momento da abertura ou execução
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
        //mostraTempo.setEditable(false);
        jPanel.add(mostraTempo, gridBagConstraints);

        descricaoHora2.setPreferredSize(new Dimension(200,25));
        gridBagConstraints.gridy ++;
        jPanel.add(descricaoHora2, gridBagConstraints);

        mostraTempo2.setPreferredSize(new Dimension(200,25));
        gridBagConstraints.gridy ++;
        //mostraTempo2.setEditable(false);
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

                for(int qtd = 0; qtd < 100; qtd++){ //simulando 100 envios em massa
                //executa o click no botão
              ObjetoFilaThread filaThread = new ObjetoFilaThread();
              filaThread.setNome(mostraTempo.getText());
              filaThread.setEmail(mostraTempo2.getText() + "-" + qtd);

              fila.add(filaThread);

            }
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        fila.start();
        add(jPanel, BorderLayout.WEST);
        setVisible(true);// torna a tela visivel para o usuario, sempre será o ultimo comando.
    }


}
