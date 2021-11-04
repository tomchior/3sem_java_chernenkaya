import java.util.Arrays;

public class MultidimentionalArrays {
    public static void main(String[] args) {
        int[][] arr1 = {
                {10,1,1000000,44,2458},
                {555,55,44},
                {8,51,5,58,41,6}
        };
        printTable(arr1);
        printTableAligned(arr1);

    }

    static void printTable(int[][] a) {
        for (int[] x : a) {
                System.out.println(Arrays.toString(x));
        }
    }

    static void printTableAligned(int[][] a) {
        for (int[] arr : a) {
            for (int i : arr) {
                System.out.printf("%8d  ", i);
            }
            System.out.println();
        }

    }



}
