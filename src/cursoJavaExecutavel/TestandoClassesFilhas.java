package cursoJavaExecutavel;

import classes.Aluno;
import classes.Diretor;
import classes.Pessoa;
import classes.Secretario;

public class TestandoClassesFilhas {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Leonardo Ledesma");
        aluno.setIdade(16);

        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("1254785");
        diretor.setNome("João");

        Secretario secretario = new Secretario();
        secretario.setExperiencia("Administração");
        diretor.setIdade(50);
        secretario.setNome("josé");

        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);
        secretario.setIdade(18);

        System.out.println("Salário Aluno é: " + aluno.salario());
        System.out.println("Salário Diretor é: " + diretor.salario());
        System.out.println("Salário Secretário é: " + secretario.salario());



    }
}
