package LocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Localizacao {

    public static void main(String[] args) {

        LocalDate data = LocalDate.of(2021, 03, 31);

        Locale[] locales = {Locale.CANADA, Locale.US, new Locale("pt", "BR"), Locale.UK};

        for (Locale locale : locales) {
            String dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale));

            System.out.println(locale + ": " + dataFormatada);
        }
    }
}