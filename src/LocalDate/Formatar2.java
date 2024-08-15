package LocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Formatar2 {

    public static void main(String[] args) {

        LocalDate data = LocalDate.of(2002, 06, 21);
        // Data inicial (2002-06-21)
        System.out.println(data);

        // Data formatada 1 (21/06/2002)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatter.format(data));

        // Data formatada 2 (21/junho/2002)
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println(formatter2.format(data));

        // Data formatada 3 (21 de junho de 2002)
        String dataFormatada3 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println(dataFormatada3);

        // Data formatada 4 (21 de jun. de 2002)
        String dataFormatada4 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println(dataFormatada4);

        // Data formatada 5 (21/06/2002)
        String dataFormatada5 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(dataFormatada5);

        // Data formatada 6 (sexta-feira, 21 de junho de 2002)
        String dataFormatada6 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(dataFormatada6);
    }
}
