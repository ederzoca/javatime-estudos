package LocalTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Formatacao {

    public static void main(String[] args) {

        LocalTime hora = LocalTime.of(13, 21, 42);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ss-mm-HH"); //HH:mm:ss
        String horaFormatada = hora.format(formatter);

        // Hora na formatação anterior (13:21:42)
        System.out.println(hora);

        // Formatação atual (42-21-13)
        System.out.println(horaFormatada);
    }
}
