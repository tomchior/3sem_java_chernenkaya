import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        // ----- Задание 2 ----- //
        String text = "23:59 and 12:54 and 77:88, и еще какие-то числа 15:60, 85:05, и 00:00";
        Pattern timePattern = Pattern.compile("(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]");
        Pattern timePattern2 = Pattern.compile("\\d\\d:\\d\\d");
        Matcher m = timePattern2.matcher(text);
        while (m.find()) {
            if (m.group().matches("(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]"))
                System.out.println(m.group() + " корректное время");
            else
                System.out.println(m.group() + " not корректное время");

        }


        System.out.println(regex_1("aahyzzkcccl123c@gmal.ru"));
        System.out.println(regex_3("Это строка  , у которой зачем-то написаны два пробела перед запятой"));
        System.out.println(regex_4("Какая-то сине-зеленовая трава"));
        System.out.println(regex_5("ляляля Кот кота кот кОт ля коТ который", "кот"));
    }

    public static boolean regex_1(String str) {
        /*  return str.matches("[a-z]+@[a-z]+\\.[a-z]{2,4}"); */ //Задание 1.1
        /*  return str.matches("[a-z0-9._-]+@[a-z0-9._-]+\\.[a-z]{2,4}"); */ // Задание 1.2
        return str.matches("([a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)])");

    }

    public static String regex_3(String str) {
        return str.replaceAll("\\s+,", ",");
    }

    public static String regex_4(String str) {
        return str.replaceAll("([а-яА-Я]+)-([а-яА-Я]+)", "$2-$1");
    }

    public static int regex_5(String str, String str_reg) {
        Pattern p = Pattern.compile(str_reg, Pattern.CASE_INSENSITIVE + Pattern.UNICODE_CHARACTER_CLASS);
        Matcher m = p.matcher(str);
        int kot = 0;
        while (m.find()) {
            kot++;
        }
        return kot;
    }

}
