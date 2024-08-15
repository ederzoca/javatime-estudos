package LocalTime;

import java.time.LocalTime;

public class DadosEspecificos {

    public static void main(String[] args) {

        LocalTime hora = LocalTime.of(13, 21, 42);

        System.out.println(hora.getHour());
        System.out.println(hora.getMinute());
        System.out.println(hora.getSecond());
        System.out.println(hora.getNano()); // Milisegundos
    }
}
