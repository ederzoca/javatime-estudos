package LocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Formatar {

    public static void main(String[] args) {
        String stringDataBr = "17/06/2022";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");  // Passando a data para a formatação americana

        LocalDate dataConcreta = LocalDate.parse(stringDataBr, formatter);

        System.out.println(dataConcreta);
    }

}
