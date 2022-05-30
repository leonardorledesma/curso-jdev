package classes;

import classes.Aluno;
import classes.Disciplina;
import classesAuxiliares.FuncaoAutenticacao;
import constantes.StatusAluno;
import excessao.ExcessaoProcessarNota;
import interfaces.PermitirAcessos;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {

        try {
            //lerArquivo();

            String login = JOptionPane.showInputDialog("Informe o login");
            String senha = JOptionPane.showInputDialog("Informe o login");

        /*Secretario secretario = new Secretario();// interface trabalhando diretamente com o objeto.
        secretario.setLogin(login);
        secretario.setSenha(senha);*/

            /*podemos instanciar a prorpia interface como um new secretario mas com isso não poderemos usar os
             * gettter e setter da classe secretario, como a seguir*/

            //FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();

            PermitirAcessos permitirAcessos = new Secretario(login, senha);


            if (new FuncaoAutenticacao(permitirAcessos).autenticar()) { // se TRUE acessa se FALSE nao acessa // vou travar para somente
                //quem tem 100% de acesso legitimo


                List<Aluno> alunos = new ArrayList<Aluno>();

                /*HashMap é uma lista que dentro dela temos uma chave que identifica uma sequencia de valores*/
                HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

        /*List<Aluno> alunosAprovados = new ArrayList<Aluno>();
        List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
        List<Aluno> alunosReprovados = new ArrayList<Aluno>();*/

                for (int qtd = 1; qtd <= 5; qtd++) {

                    String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
        String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
        /*String dataDeNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno?");
        String rg = JOptionPane.showInputDialog("Qual o rg do aluno?");
        String cpf = JOptionPane.showInputDialog("Qual o cpf do aluno?");
        String mae = JOptionPane.showInputDialog("Qual o nome da mãe do aluno?");
        String pai = JOptionPane.showInputDialog("Qual o nome do pai do aluno?");
        String matricula = JOptionPane.showInputDialog("Data da matricula?");
        String serie = JOptionPane.showInputDialog("Qual a serie?");
        String escola = JOptionPane.showInputDialog("Qual o nome da escola?");*/

                    Aluno aluno1 = new Aluno();

                    aluno1.setNome(nome);
        aluno1.setIdade(Integer.valueOf(idade));
        /*aluno1.setDataDeNascimento(dataDeNascimento);
        aluno1.setRegistroGeral(rg);
        aluno1.setNumeroCpf(cpf);
        aluno1.setNomeMae(mae);
        aluno1.setNomePai(pai);
        aluno1.setDataMatricula(matricula);
        aluno1.setSerieMatriculado(serie);
        aluno1.setNomeEscola(escola);*/

                    for (int pos = 1; pos <= 1; pos++) {
                        String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina" + pos + "?");
                        String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina" + pos + "?");

                        Disciplina disciplina = new Disciplina();
                        disciplina.setDisciplina(nomeDisciplina);
                        //disciplina.setNota(Double.parseDouble(notaDisciplina));

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
                } //procurando e removendo um aluno da lista
        /*for (classes.Aluno aluno:alunos) {
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
        for (classes.Aluno aluno: alunos) {
            System.out.println("alunos que sobraram na lista");
            System.out.println(aluno.getNome());
            System.out.println("suas materias são:");
            for (classes.Disciplina disciplina: aluno.getDisciplinas()) {
                System.out.println(disciplina.getDisciplina());

            }
        }*/

                //nova aula: percorrendo a lista pelas posições
       /* for(int pos = 0; pos < alunos.size(); pos++){
            Aluno aluno = alunos.get(pos);

            //buscar e trocar um aluno

            if (aluno.getNome().equalsIgnoreCase("alex")){
                Aluno trocar = new Aluno();
                trocar.setNome("classes.Aluno foi trocado");

                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina("Matematica");
                disciplina.setNota(96);
                trocar.getDisciplinas().add(disciplina);
                alunos.set(pos, trocar);
                aluno = alunos.get(pos);

            }
            System.out.println("classes.Aluno = " + aluno.getNome());
            System.out.println("Media do aluno =  " + aluno.getMediaNota());
            System.out.println("Aprovado ou Reprovado? " + aluno.getAlunoAprovado2());
            System.out.println("-------------------------------");

            for(Disciplina disc: aluno.getDisciplinas()){
                System.out.println("Materia = " + disc.getDisciplina() + "Nota = "+disc.getNota());
            }*/

                maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
                maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
                maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

                //Criando lista de alunos Aprovados, Reprovados e Recuperação

                for (Aluno aluno : alunos) {
                    if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
                        maps.get(StatusAluno.APROVADO).add(aluno);
                    } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                        maps.get(StatusAluno.RECUPERACAO).add(aluno);
                    } else {
                        maps.get(StatusAluno.REPROVADO).add(aluno);
                    }
                }
                System.out.println("------------ Lista dos Aprovados-----------------");
                for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
                    System.out.println("Aluno : " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2() + " com média " + aluno.getMediaNota());
                }

                System.out.println("------------ Lista em Recuperação-----------------");
                for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
                    System.out.println("Aluno : " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2() + " com média " + aluno.getMediaNota());
                }

                System.out.println("------------ Lista dos Reprovados-----------------");
                for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
                    System.out.println("Aluno : " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2() + " com média " + aluno.getMediaNota());
                }

            } else {
                JOptionPane.showMessageDialog(null, "acesso negado");
            }

        }catch(NumberFormatException e){
            e.printStackTrace();// imprime o erro no console java
            StringBuilder saida = new StringBuilder();

            //mensagem do erro ou causa
            System.out.println("Mensagem: " + e.getMessage());

            for(int i = 0; i < e.getStackTrace().length; i++){
                saida.append("\n Classe de erro: " + e.getStackTrace()[i].getClassName());
                saida.append("\n Método de erro: " + e.getStackTrace()[i].getMethodName());
                saida.append("\n Linha de erro: " + e.getStackTrace()[i].getLineNumber());
                saida.append("\n Class : " + e.getClass().getName());
            }

            JOptionPane.showMessageDialog(null,"erro de conversão de numero " + saida.toString());
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"Opa erro de null point " + e.getClass());
        }catch(Exception e){//captura todas as excessões que não prevemos.
            e.printStackTrace();
            System.out.println("erro inesperado: " + e.getClass().getName());
        }finally{ //sempre é executado ocorrendo erro ou não
            JOptionPane.showMessageDialog(null, "Obrigado por aprender Java comigo");
            }
    }
    public static void lerArquivo() throws ExcessaoProcessarNota{
        try {
            File file = new File("arquivo.txt");
            Scanner scanner = new Scanner(file);
        }catch(FileNotFoundException e){
            throw new ExcessaoProcessarNota(e.getMessage());
        }
    }
}
