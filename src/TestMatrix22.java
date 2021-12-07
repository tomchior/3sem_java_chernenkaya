import java.util.Arrays;

public class TestMatrix22 {
    public static void main(String[] args) {
        Matrix22 m1 = new Matrix22(2, 3, 5, 7);
        Matrix22 m2 = new Matrix22(11, 22, 33, 44);
        System.out.println(Arrays.deepToString(m1.getArray()));
        System.out.println(Arrays.toString(m1.getASD()));

        System.out.println("=== проверка, что значения не влияют ===");
        System.out.println(m1);
        double[][] ar = m1.getArray();
        ar[0][0] = -123;
        ar[1][0] = 1246;
        System.out.println(m1);
        System.out.println();

        System.out.println(m1.toString());
        m2.print();
        System.out.println(m2.add(m1));
        System.out.println(m1.mul(m2));
        System.out.println(m1.pow(2));

        System.out.println("=== Наследование ===");
        Matrix22.Rotation m3 = new Matrix22.Rotation(30);
        System.out.println(m3);
        System.out.println(m3.getAngle());
    }
}
