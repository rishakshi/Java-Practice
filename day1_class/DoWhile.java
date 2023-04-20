import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i;

        do{
            System.out.println("Enter value between 1 and 10 : ");
            i = sc.nextInt();
        }while(i<1 || i>10);

        System.out.println("The number : " + i);

        sc.close();
    }
}
