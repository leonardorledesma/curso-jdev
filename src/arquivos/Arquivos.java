package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {
    public static void main(String[] args) throws IOException {


        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("leonardo");
        pessoa1.setEmail("leo.ledesma@gmail.com");
        pessoa1.setIdade(39);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("leonardo2");
        pessoa2.setEmail("leo2.ledesma@gmail.com");
        pessoa2.setIdade(39);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("leonardo3");
        pessoa3.setEmail("leo3.ledesma@gmail.com");
        pessoa3.setIdade(41);

        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        File arquivo = new File("D:\\JDev\\listas2\\src\\arquivos\\arquivo.csv\\");

        if(!arquivo.exists()){
            arquivo.createNewFile();
        }
        FileWriter escrever_no_arquivo = new FileWriter(arquivo);

        for (Pessoa p :pessoas) {
            escrever_no_arquivo.write(p.getNome() + "; " + p.getEmail() + "; " + p.getIdade() + "\n");

        }
        escrever_no_arquivo.flush();
        escrever_no_arquivo.close();
    }
}
