package LocalDateTime;

import java.time.LocalDateTime;

public class Manipulacao {

    public static void main(String[] args) {

        LocalDateTime dataHora = LocalDateTime.of(2023, 6, 25, 16, 25);

        LocalDateTime proximoMes = dataHora.plusMonths(1);

        LocalDateTime dataHoraMenos15Min = dataHora.minusMinutes(15);

        LocalDateTime dataHoraDefinindoSegundos = dataHora.withSecond(33);

        System.out.println(dataHora);
        System.out.println(proximoMes);
        System.out.println(dataHoraMenos15Min);
        System.out.println(dataHoraDefinindoSegundos);
    }
}
