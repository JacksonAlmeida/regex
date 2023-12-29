package app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

    public static void main (String[] args) {
        String text = "Olá mundo!";
        String regex = "do";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // padrão;
        Matcher matcher = pattern.matcher(text); // buscar o padrão;

        while (matcher.find()) {
            System.out.println(matcher.start());
        }
    }

}
