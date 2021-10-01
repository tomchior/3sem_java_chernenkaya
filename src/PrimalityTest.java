public class PrimalityTest {
    public static void main(String[] args){
        System.out.println(NumSimple(25));
    }

    public static boolean NumSimple(int n){
        for (int i=2; i < n; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

}
