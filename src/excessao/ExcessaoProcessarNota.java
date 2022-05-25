package excessao;

public class ExcessaoProcessarNota extends Exception{
    public ExcessaoProcessarNota(String erro) {
        super("Vixi um erro no processamento de arquivo ao processar notas do aluno" + erro);
    }
}
