import java.util.Scanner;

public class Ex0525_2 {



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int coffee;
        int ret;

        System.out.printf("어떤 커피 드릴까요?(1.보통, 2.설탕, 3.블랙) :");
        coffee = s.nextInt();
        Coffeemachine cm = new Coffeemachine();
        cm.Coffee_machine(coffee);

        /*ret = coffeemachine(coffee);

        System.out.printf("손님 커피 여기 있습니다.\n");
        if(ret==0){
            System.out.printf("실행 성공");*/
        }

    }
}
