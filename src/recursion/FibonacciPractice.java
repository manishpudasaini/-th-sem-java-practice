package recursion;

public class FibonacciPractice {
    public static void main(String[] args) {
        int n=0;
        int n2 =1;
        int count =10;
        System.out.print(n + " " +n2);
        for(int i=2;i<10;i++){
            int num3 = n+n2;
            System.out.print(" "+ num3);
            n=n2;
            n2 = num3;
        }

    }
}
