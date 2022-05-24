package classesAuxiliares;


/* essa classe tem a função de realmente e somente  receber alguem que tenha o contrato da interface
PermitirAcesso e autenticar()*/

import interfaces.PermitirAcessos;

public class FuncaoAutenticacao {

    private PermitirAcessos permitirAcessos;

    public boolean autenticar(){
        return permitirAcessos.autenticar();
    }

    public  FuncaoAutenticacao(PermitirAcessos acesso){
        this.permitirAcessos = acesso;
    }



}
