package problemSloving;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int n=2; n<300000; n++) {
            list = getPrimeNumbers(n);
        }

        for (int i=1; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Total PRime Number at this point:"+list.size());
    }

    public static List<Integer> getPrimeNumbers(int num) {
        List<Integer> primeList = new ArrayList<>();
        for (int j=0; j<num; j++) {
            if(isPrime(j)) {
                primeList.add(j);
            }
        }
        return primeList;
    }

    public static boolean isPrime(int num) {
        for (int i=2; i<num; i++) {
            if (num % i==0){
                return false;
            }
        }
        return true;
    }
}
