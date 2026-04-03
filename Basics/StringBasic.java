package Basics;
import java.util.Scanner;

public class StringBasic {
    public static void main(String[] args) {
        
        // take input at run time with command java StringBasic Rahul 28
        // Rahul -> first element of array
        // 28 -> second element of array
        // System.out.println(args[0]);
        // System.out.println(args[1]);

        Integer a = 127;
        Integer b = 127;
        if(a == b){
            System.out.println("Values are equal 1");
        }

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));

        Integer d = 128;
        Integer e = 128;
        if(d == e){
            System.out.println("values are equal 2");
        }

        System.out.println(System.identityHashCode(d));
        System.out.println(System.identityHashCode(e));
    }
}
