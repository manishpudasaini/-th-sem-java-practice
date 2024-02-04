package recursion;

import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number which you want to calculate factorial of ");
        int num = scanner.nextInt();
        int factorialOfNum = factorialValue(num,num-1);
        System.out.println("factorial "+ factorialOfNum);
    }
    public static int factorialValue(int num,int lowerNum){
        if(lowerNum==0){
            return num;
        }
        int calculateFactorial = num * lowerNum;
        return factorialValue(calculateFactorial,lowerNum-1);
    }

}
