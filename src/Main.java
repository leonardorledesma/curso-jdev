import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args){

        List<Aluno> alunos = new ArrayList<Aluno>();

        for (int qtd = 1; qtd <= 2; qtd++) {

            String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+qtd+"?");
        /*String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
        String dataDeNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno?");
        String rg = JOptionPane.showInputDialog("Qual o rg do aluno?");
        String cpf = JOptionPane.showInputDialog("Qual o cpf do aluno?");
        String mae = JOptionPane.showInputDialog("Qual o nome da mãe do aluno?");
        String pai = JOptionPane.showInputDialog("Qual o nome do pai do aluno?");
        String matricula = JOptionPane.showInputDialog("Data da matricula?");
        String serie = JOptionPane.showInputDialog("Qual a serie?");
        String escola = JOptionPane.showInputDialog("Qual o nome da escola?");*/

            Aluno aluno1 = new Aluno();

            aluno1.setNome(nome);
       /* aluno1.setIdade(String.valueOf(idade));
        aluno1.setDataDeNascimento(dataDeNascimento);
        aluno1.setRegistroGeral(rg);
        aluno1.setNumeroCpf(cpf);
        aluno1.setNomeMae(mae);
        aluno1.setNomePai(pai);
        aluno1.setDataMatricula(matricula);
        aluno1.setSerieMatriculado(serie);
        aluno1.setNomeEscola(escola);*/

            for (int pos = 1; pos <= 4; pos++) {
                String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina" + pos + "?");
                String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina" + pos + "?");

                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina(nomeDisciplina);
                disciplina.setNota(Double.parseDouble(notaDisciplina));

                aluno1.getDisciplinas().add(disciplina);
            }
            int escolha = JOptionPane.showConfirmDialog(null, "deseja remover alguma disciplina?");
            if (escolha == 0) {

                int continuarRemover = 0;
                int posicao = 1;

                while (continuarRemover == 0) {
                    String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina? 1, 2, 3 ou 4");
                    aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
                    posicao++;
                    continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
                }
            }
            alunos.add(aluno1);
        }
        for (Aluno aluno:alunos) {
            if(aluno.getNome().equalsIgnoreCase("alex")) { //localizar um aluno na lista
                alunos.remove(aluno);//remover o aluno encontrado
                break;
            }else {
                System.out.println(aluno);
                System.out.println("Media do aluno: " + aluno.getMediaNota());
                System.out.println("Resultado = " + aluno.getAlunoAprovado2());
                System.out.println("-------------------------------------------------------");
            }
            }
        for (Aluno aluno: alunos) {
            System.out.println("alunos que sobraram na lista");
            System.out.println(aluno.getNome());
            System.out.println("suas materias são:");
            for (Disciplina disciplina: aluno.getDisciplinas()) {
                System.out.println(disciplina.getDisciplina());
                
            }

        }
            
        }



    }
