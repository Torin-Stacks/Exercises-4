import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int number = input.nextInt();
        int count = 2;

        while(count < number){

        if (number % count == 0 ) {

            System.out.println(number + " is not a prime number");
        }
        else System.out.println(number + " is a prime number");
            count++;
        }

    }




}
