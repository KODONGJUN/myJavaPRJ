import java.util.Scanner;
public class A_0602 {




        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            int[] arr = new int[n];

            int max = 0;
            int min = 1000001;

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
                if (max < arr[i]) max = arr[i];
                if (min > arr[i]) min = arr[i];
            }
            System.out.println(min + " " + max);

            scan.close();
        }

    }


