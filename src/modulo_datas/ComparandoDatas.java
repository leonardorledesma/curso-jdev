package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ComparandoDatas {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");
        Date dataVencimentoBoleto = simpleDateFormat.parse("10/06/2022");
        Date dataAtualHoje = simpleDateFormat.parse("08/06/2022");

        //After se data 1 é maior que a data 2
        // Before se data 1 é menor que a data 2

        if(dataVencimentoBoleto.after(dataAtualHoje)){
            System.out.println("boleto valido");
        }else{
            System.out.println("boleto vencido");
        }

        if(dataVencimentoBoleto.before(dataAtualHoje)){
            System.out.println("boleto vencido");
        }else{
            System.out.println("boleto valido");
        }

        System.out.println("---------------- trabalhando com calendar---------");

        Calendar calendar = Calendar.getInstance();// pega a data atual

        /*Simular que a data ven do banco de dados*/
        calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2022"));//definindo uma data qualquer

        calendar.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("Somando dia do mes " + new SimpleDateFormat("dd/MM/yyy").format(calendar.getTime()));

        calendar.add(Calendar.MONTH, 1);
        System.out.println("Somando Mês " + new SimpleDateFormat("dd/MM/yyy").format(calendar.getTime()));

        calendar.add(Calendar.YEAR, 1);
        System.out.println("Somando 1 ano " + new SimpleDateFormat("dd/MM/yyy").format(calendar.getTime()));
    }
}
