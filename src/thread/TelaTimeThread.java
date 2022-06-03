package thread;

import javax.swing.*;
import java.awt.*;

public class TelaTimeThread extends JDialog {
    public TelaTimeThread() {//executa o que estiver dentro no momento da abertura ou execução
        setTitle("Minha tela de time com thread "); //titulo da thread
        setSize(new Dimension(240,240));//dimensão da tela
        setLocationRelativeTo(null); //posição em relação a um objeto
        setResizable(false); // com false não permite redimensionamento da tela


        setVisible(true);// torna a tela visivel para o usuario, sempre será o ultimo comando.
    }


}
