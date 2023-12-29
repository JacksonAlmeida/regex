package app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

    public static void main (String[] args) {

        /* Meta caracteres: Como se fosse um atalho para buscar determinados characters;
        Ex.:
            \d || \\d = todos os digitos;
            \D || \\D = todos que não forem digitos;
            \s || \\s = espaços em brancos -> \t, \n, \f, \r;
            \S || \\S = todos os caracters, excluindo os brancos;
            \w || \\w = todos os caracters[a-z A-Z] e o _ ;
            \W || \\W = tudo que não for incluso no \w;
            [] = range;
            ? = zero ou um;
            * = zero u mais;
            + = um ou mais;
            {n, m} = de n até m;
            () = agrupamento;
            | = ou;
            $ = fim da linha;
        */

        String text = "12 0x 0X 0xFFABC 0x10G 0x1";
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // padrão;
        Matcher matcher = pattern.matcher(text); // buscar o padrão;

        while (matcher.find()) {
            System.out.println("index: " + matcher.start() + ", caracter: " + matcher.group());
        }
    }

}
