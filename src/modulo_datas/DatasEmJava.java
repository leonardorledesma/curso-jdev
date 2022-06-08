package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();

        System.out.println("Data em milisegundos: " + date.getTime());
        System.out.println("Calendar em milisegundos: " + calendar.getTimeInMillis());

        System.out.println("Dia do mês: " + date.getDate());
        System.out.println("Calendar Dia do mês: " + calendar.get(Calendar.DAY_OF_MONTH));

        System.out.println("Dia da semana: " + date.getDay());
        System.out.println("Calendar Dia da semana: " + calendar.get(Calendar.DAY_OF_WEEK));

        System.out.println("Hora do dia: " + date.getHours());
        System.out.println("Calendar Hora do dia: " + calendar.get(Calendar.HOUR_OF_DAY));

        System.out.println("Minuto da hora: " + date.getMinutes());
        System.out.println("Calendar Minuto da hora: " + calendar.get(Calendar.MINUTE));

        System.out.println("Segundo da hora: " + date.getSeconds());
        System.out.println("Calendar Segundo da hora: " + calendar.get(Calendar.SECOND));

        System.out.println("ano a partir de 1900: " + (date.getYear() + 1900));
        System.out.println("Calendar ano : " + calendar.get(Calendar.YEAR));

        /* --------------- Simple Date Format --------------*/
        System.out.println("Simple Date Format ");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");
        System.out.println("Data atual em formato padrão e String " + simpleDateFormat.format(date));
        System.out.println("Calendar Data atual em formato padrão e String " + simpleDateFormat.format(calendar.getTime()));

        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Formato para banco de dados " + simpleDateFormat.format(date));

        System.out.println("Objeto de data: " + simpleDateFormat.parse("1983-05-26"));// recebe uma string e transforma em data
    }
}
