package cursoJavaExecutavel;

public class Matrizes {
    public static void main(String[] args) {
        int notas[][] = new int[2][3];
        notas[0][0] = 80;
        notas[0][1] = 90;
        notas[0][2] = 70;

        notas[1][0] = 40;
        notas[1][1] = 60;
        notas[1][2] = 30;

        //System.out.println(notas);

        for(int poslinha = 0; poslinha < notas.length; poslinha++){// percorre as linhas
            System.out.println("-----------------------------------");
            
            for(int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna++){ //para cada linha percorre a coluna
                System.out.println("Valores da matriz: " + notas[poslinha][poscoluna]);
            }
        }

    }
}
