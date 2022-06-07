package thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

    private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila =
            new ConcurrentLinkedQueue<ObjetoFilaThread>();

    public static void add(ObjetoFilaThread objetoFilaThread) {
        pilha_fila.add(objetoFilaThread);
    }

    @Override
    public void run() {

        System.out.println("Fila Rodando");


        while (true) {
            Iterator iteracao = pilha_fila.iterator();

            synchronized (iteracao) {//bloquear o acesso a lista por outros processos
                while (iteracao.hasNext()) {// enquanto conter dados na lista irá processar
                    ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); // processa o objeto atualiz


                    /* processar 10 mil notas fiscais*/
                    /* gerar lista de pdf*/
                    /* gerar envio em massa de email */

                    System.out.println("-----------------------------");

                    System.out.println(processar.getEmail());
                    System.out.println(processar.getNome());

                    iteracao.remove();

                    try {
                        Thread.sleep(100);// dar um tempo para descarga de memória
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            try {
                Thread.sleep(1000);// processou toda a lista dá um tempo para limpeza de memória
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
