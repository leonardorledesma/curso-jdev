package cursoJavaExecutavel;

import classes.Aluno;
import classes.Disciplina;

import javax.swing.*;

public class ArrayVetor {
    public static void main(String[] args) {
        /* Array pode ser de todos os tipos de dado e objetos */
        // Array sempre deve ter a quantidade de posições definidas

        // atribuir valores as posições do array

        /*String posicoes = JOptionPane.showInputDialog("Quantas posições o array deve ter?");
        double[] notas = new double[Integer.parseInt(posicoes)];

        for (int pos = 0; pos <notas.length; pos++){
            String valor = JOptionPane.showInputDialog("Qual o valor da posição " + pos + " :");
            notas[pos] = Double.valueOf(valor);
        }


       for (int pos = 0; pos < notas.length; pos++){
           System.out.println("Nota " + (pos + 1) + " é = " + notas[pos]);
       }*/

        double[] notas = {8.8, 8.6, 9.7, 7.5};
        double[] notasLogica = {8.9, 7.7, 9.8, 8.6};

        //criação do aluno
        Aluno aluno = new Aluno();
        aluno.setNome("Leonardo");

        //criação da disciplina
        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Curso java");
        disciplina.setNota(notas);

        aluno.getDisciplinas().add(disciplina);

        Disciplina disciplina2 = new Disciplina();
        disciplina.setDisciplina("Lógica");
        disciplina.setNota(notasLogica);
        aluno.getDisciplinas().add(disciplina2);
    }
}
