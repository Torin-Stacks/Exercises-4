public class ReverseMultiplicationTable {

    public static void main(String[] args) {

//        int i = 10;
//        while(i <= 10){
//            int j = 10;
//            while (j <= 10){
//                System.out.print(j + " ");
//                System.out.print(i * j);
//                j--;
//            }
//
//
//            System.out.println(i);
//            i--;
//
//        }


        int x = 10;
        while(x >= 1){
            System.out.print(x + " ");
            x--;
        }
        System.out.println();
        int i = 10;

        while(i >= 1){
            System.out.printf(i + " ");
            int j = 10;
        while(j >= 1){
            //System.out.print(j);
            System.out.print(i * j + " ");
            j--;
        }
        System.out.println();
            i--;
        }


    }
}
//System.out.printf("%5d", j);
//        System.out.println( i);