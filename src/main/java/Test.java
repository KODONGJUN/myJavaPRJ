import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a;


        System.out.printf("정수를 입력하세요 : ");
        a = s.nextInt();

        if (a%2==1) {
            System.out.print("홀");
        }else {
            System.out.printf("짝");
        }
    }
}
