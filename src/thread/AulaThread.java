package thread;

import javax.swing.*;

public class AulaThread {
    public static void main(String[] args) throws InterruptedException {


        //thread processando em paralelo do envio de email.
       Thread threadEmail = new Thread(thread1);
       threadEmail.start();

        Thread threadNFCE = new Thread(thread2);
        threadNFCE.start();

        //código do sistema do usuario continua o fluxo de trabalho
        System.out.println("CHEGOU AO FIM DA THREAD");
        //Fluxo do sistema, cadastro de venda, emissão de nota fiscal, etc.
        JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuario");
    }
    private static Runnable thread1 = new Runnable(){

        @Override
        public void run() {
            //código da rotina

            /*código da rotina que eu quero executar em paralelo*/
            for(int pos = 0; pos < 10; pos++){

                try {
                    Thread.sleep(1000);//Dá um tempo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // quero executar este envio com um tempo de parada, ou tempo determinado
                System.out.println("Executando alguma rotina, exemplo envio de email");
            }
            //fim do código em paralelo

        }
    };
    private static Runnable thread2 = new Runnable(){

        @Override
        public void run() {
            //código da rotina

            /*código da rotina que eu quero executar em paralelo*/
            for(int pos = 0; pos < 10; pos++){

                try {
                    Thread.sleep(2000);//Dá um tempo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // quero executar este envio com um tempo de parada, ou tempo determinado
                System.out.println("Executando alguma rotina, exemplo envio de nota fiscal");
            }
            //fim do código em paralelo

        }
    };
}
