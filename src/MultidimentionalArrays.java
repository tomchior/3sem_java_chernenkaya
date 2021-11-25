import java.util.Arrays;

public class MultidimentionalArrays {
    public static void main(String[] args) {
        int[][] arr1 = {
                {10, 10, 14, 44, 24,59},
                {55, 55, 55, 55, 78},
                {88, 51, 55, 58},
                {98, 68, 56}
        };
        printTable(arr1);
        printTableAligned(arr1);

        char[][] c = createTable(20, '.');
        printTable(c);

        System.out.println("============ Заполним строки: ==========");
        fillFirstAndLastLines(c, '#');
        printTable(c);

        System.out.println("============ Заполним столбцы: =========");
        fillFirstAndLastColumns(c, '#');
        printTable(c);

    }

    static void printTable(int[][] a) {
        //for (int[] x : a) {
         //   System.out.println(Arrays.toString(x).substring(1).replaceFirst("]", " ").replace(",", " "));
       // }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
           System.out.println();
        }
    }

    static void printTableAligned(int[][] a) {
        int maxLength = 0;
        String format;
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                temp = String.valueOf(a[i][j]).length();
                if (temp > maxLength) {
                    maxLength = temp;
                }
            }
        }

        format = "%" + maxLength + "d  ";
        for (int[] arr : a) {
            for (int i : arr) {
                System.out.printf(format, i);
            }
            System.out.println();
        }

    }

    public static char[][] createTable(int size, char s) {
        char[][] mass = new char[size][size];
        for (int i = 0; i < size; i++) {
            Arrays.fill(mass[i], s);
        }
        return mass;
    }

    public static void printTable(char[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillFirstAndLastLines(char[][] mass, char s) {
        Arrays.fill(mass[0], s);
        Arrays.fill(mass[mass.length - 1], s);

    }

    public static void fillFirstAndLastColumns(char[][] mass, char s) {
        for (int i = 0; i < mass.length; i++) {
            mass[i][0] = s;
            mass[i][mass.length - 1] = s;
        }
    }
}
