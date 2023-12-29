package app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

    public static void main (String[] args) {
        String regex = "Olá mundo!";
        String m = "do";
        Pattern pattern = Pattern.compile(m, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(regex);

        while (matcher.find()) {
            System.out.println(matcher.start());
        }
    }

}
