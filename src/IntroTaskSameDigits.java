public class IntroTaskSameDigits {
    public static void main (String[] args){
        int a = 88988;
        int b = a % 100; //b = 98
        int c = b / 10; // c = 9
        if (c == (a % 10)) {
            System.out.println("На конце одинаковые цифры");
        } else {
            System.out.println("На конце разные цифры");
        }
    }
}