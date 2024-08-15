package Trasformacao;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeToLocalDate {

    public static void main(String[] args) {

        LocalDateTime dataHora = LocalDateTime.now();

        LocalDate data = dataHora.toLocalDate();

        System.out.println(dataHora);
        System.out.println(data);
    }
}
