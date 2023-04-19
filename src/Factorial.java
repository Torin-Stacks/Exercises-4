public class Factorial {

    public static void main(String[] args) {
        factorial(5);
    }
    public static int factorial(int count) {
        int counter = count;
        int total = 1;
        int factorialLimit = 1;

        while(counter >= factorialLimit){
            System.out.printf("%s * %s%n", total ,counter);
            total = total * counter;
            System.out.println(total);
            counter--;

        }

        return total;
    }
}
