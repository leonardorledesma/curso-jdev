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
        aluno.setNomeEscola("Jdev treinamento");

        //criação da disciplina
        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Curso java");
        disciplina.setNota(notas);

        aluno.getDisciplinas().add(disciplina);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Lógica");
        disciplina2.setNota(notasLogica);
        aluno.getDisciplinas().add(disciplina2);


        System.out.println("nome do aluno: " + aluno.getNome() + " Matriculado no curso: " + aluno.getNomeEscola());
      
        for (Disciplina d : aluno.getDisciplinas()){
            System.out.println("--------- Disciplina do aluno-----------");
            System.out.println("Disciplina : " + d.getDisciplina());
            System.out.println("As notas da disciplina são: ");

            double notaMax = 0.0;
            double notaMin = 0.0;
            for(int pos = 0; pos < notas.length; pos++){
                System.out.println("Nota " + pos + " é igual a : " + d.getNota()[pos]);
                
                if (pos == 0){
                    notaMax = d.getNota()[pos];
                }else{
                    if(d.getNota()[pos] > notaMax ){
                        notaMax = d.getNota()[pos];
                    }
                }
                if (pos == 0){
                    notaMin = d.getNota()[pos];
                }else{
                    if(d.getNota()[pos] < notaMin ){
                        notaMin = d.getNota()[pos];
                    }
                }
            }
            System.out.println("A maior nota da disciplina " + d.getDisciplina() + " é de valor : " + notaMax);
            System.out.println("A menor nota da disciplina " + d.getDisciplina() + " é de valor : " + notaMin);
        }
    }
}
