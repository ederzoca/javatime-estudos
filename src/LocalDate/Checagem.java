package LocalDate;

import java.time.LocalDate;

public class Checagem {

    public static void main(String[] args) {

        LocalDate data1 = LocalDate.of(2023, 03, 04);
        LocalDate data2 = LocalDate.of(2024, 07, 15);

        // data2 está após a data1? true
        System.out.println(data2.isAfter(data1));

        // data1 está após a data2? false
        System.out.println(data1.isAfter(data2));

        // data2 está antes da data1? false
        System.out.println(data2.isBefore(data1));

        // data1 está antes da data2? true
        System.out.println(data1.isBefore(data2));
    }
}
