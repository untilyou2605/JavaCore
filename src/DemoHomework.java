
import java.util.Scanner;

public class DemoHomework {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Answer answer = new Answer();
       
        int f;
        while (true) {
            System.out.println("Enter funtion :");
            f = in.nextInt();
            if (f == 0) {
                break;
            }
            switch (f) {
                case 1:
                    answer.f1();
                    break;
                case 2:
                    answer.f2();
                    break;
                case 3:
                    answer.f3();
                    break;
                case 4:
                    answer.f4();
                    break;
                case 5:
                    answer.f5();
                    break;
                case 6:
                    answer.f6();
                    break;
                case 7:
                    answer.f7();
                    break;
                case 8:
                    answer.f8();
                    break;
                
            }

        }

    }
}
