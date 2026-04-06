package Basics;
import java.util.Scanner;

public class Methods_argument {
    // args in java
    static int sum(int... args){
       
        int sum = 0;

        for(int ele : args){
            sum += ele;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        int result = sum(10, 20, 30,40, 50, 60 ,70);
        System.out.println("Sum of numbers "+result);
    }
}
