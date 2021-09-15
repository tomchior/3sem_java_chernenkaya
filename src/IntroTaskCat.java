public class IntroTaskCat {
    public static void main(String[] args){
        System.out.println(TaskCat());
    }

    public static String TaskCat() {
            int a = 33;
            if(a % 100 >= 11 & (a % 100 <= 20)){
                return a + " " + "котов";
            }else if(a % 10 >= 2 & a % 10 <= 4){
                return a + " " + "кота";
            }else if(a % 10 == 1){
                return a + " " + "кот";
            }else{
                return a + " " + "котов";
            }
        }

}

