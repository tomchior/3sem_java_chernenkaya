public class IntroTaskQuadraticEquation {
    public static void main(String[] args) {
        System.out.println(TaskEquation(1,6,5));
    }

    public static String TaskEquation(double a, double b,double c) {
        double D = b * b - 4 * a * c;
        String res="";
        if (D > 0 && a != 0) {
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            if (x1 < x2)
                res = String.format("Первый корень = %.2f , второй корень = %.2f" , x1, x2);
            else if(x1 > x2)
                res = String.format("Первый корень = %.2f , второй корень = %.2f" , x2, x1);
        } else if (a == 0 && b == 0 && c == 0) {
            res = "Решений бесконечно много";
        } else if (D == 0 && a != 0) {
            double x = (-b - Math.sqrt(D)) / (2 * a);
            res = String.format("Одно решение: x = " + "%.2f ",x);
        } else if (D < 0 && a != 0) {
            res  = "Решений нет";
        } else if (a == 0 && b != 0) {
            double x = c/b;
            res = String.format("Одно решение: x = " + "%.2f ",x);
        }
        return res;
    }

}