package classes;


import interfaces.PermitirAcessos;

public class Secretario extends Pessoa implements PermitirAcessos {
    private String registro;
    private String nivelCargo;
    private String experiencia;

    private String login;
    private String senha;

    public Secretario(){};
    public Secretario(String login, String senha){
        this.login = login;
        this.senha = senha;
    };

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNivelCargo() {
        return nivelCargo;
    }

    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Secretario{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", registro='" + registro + '\'' +
                ", nivelCargo='" + nivelCargo + '\'' +
                ", experiencia='" + experiencia + '\'' +
                '}';
    }


    @Override
    public double salario() {
        return 1800.90 * 0.9;
    }

        //esse é o contrato de autenticação
    /*@Override
    public boolean autenticar() {
        return login.equals("admin") && senha.equals("admin");// retorna sim caso login e senha sejam admin
    }*/

    @Override
    public boolean autenticar(String login, String senha) {
        this.login = login;
        this.senha = senha;
        return autenticar();
    }

    @Override
    public boolean autenticar() {
        return login.equals("admin") && senha.equals("admin");
    }



    /*public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }*/
}
