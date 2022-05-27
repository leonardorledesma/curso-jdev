package cursoJavaExecutavel;

import javax.swing.*;

public class ArrayVetor {
    public static void main(String[] args) {
        /* Array pode ser de todos os tipos de dado e objetos */
        // Array sempre deve ter a quantidade de posições definidas

        // atribuir valores as posições do array

        String posicoes = JOptionPane.showInputDialog("Quantas posições o array deve ter?");
        double[] notas = new double[Integer.parseInt(posicoes)];

        for (int pos = 0; pos <notas.length; pos++){
            String valor = JOptionPane.showInputDialog("Qual o valor da posição " + pos + " :");
            notas[pos] = Double.valueOf(valor);
        }


       for (int pos = 0; pos < notas.length; pos++){
           System.out.println("Nota " + (pos + 1) + " é = " + notas[pos]);
       }
    }
}
