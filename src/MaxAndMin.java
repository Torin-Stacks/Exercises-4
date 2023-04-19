public class MaxAndMin {

    public static void main(String[] args) {
        System.out.println(maximum(5, 10,9, 4,6));
        System.out.println(minimum(2,9,6));
    }
    public static int maximum(int a, int b, int c, int d, int e){

      int max = Math.max(a, Math.max(b,Math.max(c,Math.max(d, e))));
      return max;
    }

    public static int minimum(int a, int b, int c){

        int min =  Math.min(a, Math.min(b,c));
        return min;
    }

}
