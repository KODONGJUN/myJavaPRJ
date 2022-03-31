public class Exam6 {
    public static void main(String[] args) {

        int a1 = 10;
        int i = 2;

        boolean value = ( ((a1 = a1 + 10) < 10)||(i = i + 2) > 10);
        System.out.println(value);
        System.out.println(a1);
        System.out.println(i);
    }
}
