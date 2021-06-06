package sorting;

public class Swapping {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Num-1: " + num1);
        System.out.println("Num-2: " + num2);

        String st1 ="bitcoin";
        String st2 = "ethereum";
        String tempst;

        tempst = st1;
        st1 = st2;
        st2 = tempst;
        System.out.println("String-1: " +st1);
        System.out.println("String-2: " +st2);


        // 3 numbers swapping

        int n1 = 40;
        int n2 = 50;
        int n3 = 60;
        int t1;
        int t2;

        t1 = n3;
        t2 = n2;
        n3 = n1;
        n2 = t2;
        n1 = t1;
        System.out.println("Num-1: " +n1);
        System.out.println("Num-2: " +n2);
        System.out.println("Num-3: " +n3);



    }
}
