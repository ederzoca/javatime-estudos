package LocalDate;

import java.time.LocalDate;

public class Manipular {

    public static void main(String[] args) {

        LocalDate nascimentoMari = LocalDate.of(2003,07,01);

        LocalDate dataQueTera30Anos = nascimentoMari.plusYears(30);
        LocalDate novaData = nascimentoMari.minusDays(15);

        System.out.println(dataQueTera30Anos);
        System.out.println(novaData);
    }

}
