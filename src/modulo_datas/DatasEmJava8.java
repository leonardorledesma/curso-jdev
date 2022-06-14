package modulo_datas;

import java.time.LocalDate;

public class DatasEmJava8 {
    public static void main(String[] args) {
        LocalDate database = LocalDate.parse("2019-10-05");
        System.out.println("Mais 5 dias: "+ (database = database.plusDays(5)));

        System.out.println("Mais 5 semanas: "+(database = database.plusWeeks(5)));

        System.out.println("Mais 5 anos: "+(database = database.plusYears(5)));
        System.out.println("Mais 2 meses: "+(database = database.plusMonths(2)));

        System.out.println("Menos 1 ano: "+(database = database.minusYears(1)));
        System.out.println("Menos 1 mês: "+(database = database.minusMonths(1)));
        System.out.println("Menos 1 dia: "+(database = database.minusDays(1)));

    }
}
