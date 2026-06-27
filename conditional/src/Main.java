import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " çift sayıdır");
        } else if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + "15 in bir katıdır");
        }else{
            System.out.println(number +" tek sayıdır");
        }

    }
}