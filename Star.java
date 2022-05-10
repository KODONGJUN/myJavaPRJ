import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        System.out.printf("숫자를 입력하세요 : ");
        a = s.nextInt();

        for(b = 0; b <= a; b++){
            for (int i = 0; i < b; i++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }

    }
}
