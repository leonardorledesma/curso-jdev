package modulo_datas;

import java.time.LocalDate;
import java.time.Period;

public class DatasEmJAva7 {
    public static void main(String[] args) {
        LocalDate dataAntiga = LocalDate.of(2020, 2, 7);
        LocalDate novaData = LocalDate.of(2021, 7 , 4);
        System.out.println("Data antiga é maior que a data nova: " + dataAntiga.isAfter(novaData));
        System.out.println("Data antiga é anterior: " + dataAntiga.isBefore(novaData));

        System.out.println("Datas são iguais: " + dataAntiga.isEqual(novaData));

        Period periodo = Period.between(dataAntiga, novaData);
        System.out.println("Quantos dias: " + periodo.getDays());
        System.out.println("Quantos meses: " + periodo.getMonths());
        System.out.println("Quantos anos: " + periodo.getYears());
        System.out.println("Total de meses: " + periodo.toTotalMonths());
        System.out.println("Anos: " + periodo.getYears() + " Meses: " + periodo.getMonths() + " dias: " + periodo.getDays());
    }
}
