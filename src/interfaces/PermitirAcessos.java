package interfaces;
//essa interface será nosso contrato de autenticação
public interface PermitirAcessos {
    public boolean autenticar(); //apenas declaração do método
    public boolean autenticar(String login, String senha);
}
