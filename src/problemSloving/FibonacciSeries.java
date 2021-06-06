package problemSloving;

public class FibonacciSeries {

    public static void main(String[] args) {

        int prev = 0;
        int next = 1;

        for( int i=0; i<47; i++) {  // series overflows after 47

            System.out.println(prev);
            prev = prev + next;
            next = prev - next;
        }
    }
}
