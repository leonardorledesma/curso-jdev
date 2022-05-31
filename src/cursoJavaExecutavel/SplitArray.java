package cursoJavaExecutavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {
    public static void main(String[] args) {
        String text = "Leonardo, curso Java, 90, 80, 70, 60";

        String[] valoresArray = text.split(",");
        System.out.println(valoresArray);

        System.out.println("nome: " + valoresArray[0]);
        System.out.println("Curso: " + valoresArray[1]);
        System.out.println("nota 1: " + valoresArray[2]);
        System.out.println("nota 2: " + valoresArray[3]);
        System.out.println("nota 3: " + valoresArray[4]);
        System.out.println("nota 4: " + valoresArray[5]);

        // convertendo array em lista em lista
        System.out.println(" convertendo array em lista");
        List<String> list = Arrays.asList(valoresArray);
        for (String valorString: list) {
            System.out.println(valorString);
        }

        //convertendo lista em array
        System.out.println("convertendo lista em array");
        String[] conversaoArray = list.toArray(new String[6]);
        for(int pos = 0; pos< conversaoArray.length; pos++){
            System.out.println(conversaoArray[pos]);
        }
    }
}
