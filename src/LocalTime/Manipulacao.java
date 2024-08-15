package LocalTime;

import java.time.LocalTime;

public class Manipulacao {

    public static void main(String[] args) {

        LocalTime horaAtual = LocalTime.now();
        LocalTime horaAtualMais30Min = horaAtual.plusMinutes(30);
        LocalTime horaAtualMenos2Hr = horaAtual.minusHours(2);

        System.out.println(horaAtual);
        System.out.println(horaAtualMais30Min);
        System.out.println(horaAtualMenos2Hr);

    }
}
