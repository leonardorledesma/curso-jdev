package arquivos.arquivos;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class ApachePoiEditando2 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\JDev\\listas2\\src\\arquivos\\arquivos\\arquivo_excel.xls");
        FileInputStream entrada = new FileInputStream(file);
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);// prepara a entrada do arquivo xls do excel
        HSSFSheet planilha = hssfWorkbook.getSheetAt(0);// pegando a planilha do

        Iterator<Row> linhaIterator = planilha.iterator();

        while(linhaIterator.hasNext()){// enquanto tiver linha
            Row linha = linhaIterator.next();//dados da pessoa na linha

           // int numeroCelulas = linha.getPhysicalNumberOfCells();//quantidade de celulas

            String valorCelula = linha.getCell(0).getStringCellValue();
            linha.getCell(0).setCellValue(valorCelula + " * valor gravado na aula");
        }

        entrada.close();

        FileOutputStream saida = new FileOutputStream(file);
        hssfWorkbook.write(saida);
        saida.flush();
        saida.close();
        System.out.println("Planilha atualizada");

    }
}
