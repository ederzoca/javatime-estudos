package LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formatacao {

    public static void main(String[] args) {

        LocalDateTime dataHora =  LocalDateTime.of(2023,7,22,17,33);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = dataHora.format(formatter);

        System.out.println(dataHora);
        System.out.println(dataHoraFormatada);
    }
}
