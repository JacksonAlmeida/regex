package app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

    public static void main (String[] args) {
        String text = "Olá mundo! 123... Vasco!!!!!!!";
        String regex = "\\d";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // padrão;
        Matcher matcher = pattern.matcher(text); // buscar o padrão;

        /* Meta caracteres: Como se fosse um atalho para buscar determinados characters;
        Ex.:
            \d || \\d = todos os digitos;
            \D || \\D = todos que não forem digitos;
            \s || \\s = espaços em brancos -> \t, \n, \f, \r;
            \S || \\S = todos os caracters, excluindo os brancos;
            \w || \\w = todos os caracters[a-z A-Z] e o _ ;
            \W || \\W = tudo que não for incluso no \w;
        */

        while (matcher.find()) {
            System.out.println("index: " + matcher.start() + ", caracter: " + matcher.group());
        }
    }

}
