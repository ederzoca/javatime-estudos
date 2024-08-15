package LocalTime;

import java.time.LocalTime;

public class Comparacao {

    public static void main(String[] args) {

        LocalTime horaAtual = LocalTime.now();
        LocalTime horaAtualMenos2Horas = horaAtual.minusHours(2);

        boolean passado = horaAtual.isAfter(horaAtualMenos2Horas);

        System.out.println(passado);
    }
}
