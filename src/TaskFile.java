import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class TaskFile {
    static final Path from = Path.of("number");
    static final String to = "result.txt";

    public static void main(String[] args) throws Exception {
        int[] array;
        try (Scanner s = new Scanner(from, StandardCharsets.UTF_8)) {
            array = new int[s.nextInt()];
            for (int i = 0; i < array.length; i++) {
                array[i] = s.nextInt();
            }
        }

        int max = array[0];
        for (int i : array)
            if (i > max)
                max = i;
        max = String.valueOf(max).length();

        String s = "";
        for (int i : array) {
            s += " ".repeat(max - String.valueOf(i).length()) + i + "\n";
        }
        try (PrintStream outFile = new PrintStream(to, StandardCharsets.UTF_8)) {
            outFile.print(s);
        }
    }
}
