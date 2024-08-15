package LocalDateTime;

import java.time.LocalDateTime;

public class Comparacao {

    public static void main(String[] args) {

        LocalDateTime dataHora1 = LocalDateTime.of(2023,6,25,16,25);
        LocalDateTime dataHora2 = LocalDateTime.of(2025,8,25,13,56);

        // Comparando dois objetos data/hora em sua totalidade
        boolean dataHoraIgual = dataHora1.isEqual(dataHora2);

        // Comparando digitos específicos de uma data e hora
        boolean dataHoraDigitoIgual = dataHora1.getDayOfMonth()==dataHora2.getDayOfMonth();

        System.out.println(dataHoraIgual);
        System.out.println(dataHoraDigitoIgual);
    }
}
