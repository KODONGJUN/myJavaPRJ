import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a;
        System.out.printf("숫자를 입력하세요 : ");
        a = s.nextInt();

        if((a % 3 == 0)&&(a % 5 == 0)) {
            System.out.printf("3의배수 5의 배수 모두 만족");

        }else if   ( a % 3 == 0) {
            System.out.printf("3의 배수");
        }else if ( a % 5 ==0){
                System.out.printf("5의 배수");
            }




        }
    }







//3의 배수 5의 배수 모두 만족 , 3의 배수 만족 , 5의 배수만족
