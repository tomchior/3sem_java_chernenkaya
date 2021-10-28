import java.util.Arrays;


public class ArraysTasks {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(even(20)));
        int[] array1 = {2,2,2,2,2};
        int[] array2 = {2,3,4,15,25};
        System.out.println(allSimilar(array1));
        System.out.println(hasSimilar(array2));
        System.out.println(mean(new int[]{1,2,3,45}));
        shift(array2);
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(copyShift(new int[]{1,2,5,45,8,19,3})));


    }

    static int[] even(int n) {
        int a = n;
        int[] numbers = new int[a];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                numbers[i] = 2*(i+1);
            }
            }
        return numbers;
        }


    static boolean allSimilar(int[] a) {
        if(a.length == 0) {
            return true;
        } else {
            int first = a[0];
            for (int element : a) {
                if (element != first) {
                    return false;
                }
            }
            return true;
        }
    }


    static boolean hasSimilar(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    return true;
                }
            }
        }
        return false;
    }


    static double mean(int[] a) {
        double sum = 0;
        for (int x: a) {
            sum += x;
        }
        return sum;
    }

    static void shift(int[] a) {
        int[] b = new int[a.length];
        b[0] = a[a.length-1];
        for(int i = 1; i < a.length; i++) {
                b[i] = a[i-1];
            }
        for(int i = 0; i < a.length; i++) {
            a[i] = b[i];
        }
    }


    static int[] copyShift(int[] a) {
        int[] b = new int[a.length];
        b[0] = a[a.length-1];
            for(int i = 1; i < b.length; i++) {
                b[i] = a[i-1];
            }
        return b;
    }

}








