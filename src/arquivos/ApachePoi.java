package arquivos;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApachePoi {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\JDev\\listas2\\src\\arquivos\\arquivo_excel.xls");
        if (!file.exists()){
          file.createNewFile();
        }

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

        HSSFWorkbook  hssFWorkbook = new HSSFWorkbook();// vai ser usado para escrever a planilha
        HSSFSheet linhaPessoa = hssFWorkbook.createSheet("Panilha de pessoas JDev treinamento");// criar a planilha
        
        int numeroLinha = 0;
        for(Pessoa p : pessoas){
            Row linha = linhaPessoa.createRow(numeroLinha ++);

            int celula = 0;
            Cell celNome = linha.createCell(celula++);
            celNome.setCellValue(p.getNome());

            Cell celEmail = linha.createCell(celula++);
            celEmail.setCellValue(p.getEmail());

            Cell celIdade = linha.createCell(celula++);
            celIdade.setCellValue(p.getIdade());
            
        }// terminou de montar a planilha
        FileOutputStream saida = new FileOutputStream(file);
        hssFWorkbook.write(saida);// escreve a planilha em arquivos
        saida.flush();
        saida.close();
        System.out.println("Planilha criada");
    }
}
