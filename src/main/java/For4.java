public class For4 {
    public static void main(String[] args) {
        int f = 1;
        int i;

        for (i=5; i>0; i--){
            f *= i;
            System.out.println("중간값 : " +f);
        }
        System.out.println("5! : " +f);
    }
}
