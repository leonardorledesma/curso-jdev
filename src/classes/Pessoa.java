package classes;
//classe pai ou super classe ou classe master (atributos conuns a todas as classes filhos)
//quando tornamos uma classe abstrata ela não pode ser instanciada diretamente
// já o metodo abstrato obriga as classes filhas a sobreescrever os metodos
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String dataDeNascimento;
    protected String registroGeral;
    protected String numeroCpf;
    protected String nomeMae;
    protected String nomePai;

    public abstract double salario();

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome){}


    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public boolean pessoaMaiorIdade(){
        return idade >= 18;
    }

}
