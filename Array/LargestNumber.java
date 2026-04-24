package Array;

/*

Given an Array
1. Find largest Number 
2. Find 2nd largest Number
3. Find 3rd Largest Number

*/

public class LargestNumber {

    static public int largestNumber(int[] Number){
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<Number.length; i++){
            if(ans < Number[i]){
                ans = Number[i];
            }
        }
        return ans;
    }

    static public int SecondLargestNumber(int[] Number){
        // suppose array have length > 1
        int num1 = Number[0];
        int num2 = Integer.MIN_VALUE;
        for(int i=1; i<Number.length; i++){
            if(Number[i] >= num1){
                num2 = num1;
                num1 = Number[i];
            }else if(Number[i] > num2){
                num2 = Number[i];
            }
        }
        return num2;
    }

    static public int ThirdLargestNumber(int[] Number){
        // Array length will be >=3
        int num1 = Math.max(Number[0], Number[1]);
        int num2 = Math.min(Number[0], Number[1]);
        int num3 = Integer.MIN_VALUE;

        for(int i=2; i<Number.length; i++){
            if(Number[i] >= num1 ){
                num3 = num2;
                num2 = num1;
                num1 = Number[i];
            }
            else if(Number[i] >= num2){
                num3 = num2;
                num2 = Number[i];
            }else if(Number[i] > num3){
                num3 = Number[i];
            }
        }
        return num3;
    }


    public static void main(String[] args) {
        int[] Number = {10, 10, 10};
        int lanum = largestNumber(Number);
        int Slanum = SecondLargestNumber(Number);
        int Thlanum = ThirdLargestNumber(Number);

        System.out.println("First Largest Number: "+lanum);
        System.out.println("Second Largest Number: "+Slanum);
        System.out.println("Third Largest Number: "+Thlanum);

    }
}
