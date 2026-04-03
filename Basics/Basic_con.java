package Basics;

public class Basic_con{
    public static void main(String[] args) {
    //   System.out.println(10 + 10);
    //   System.out.println("Hello" + (10 + 20) + 10);   
    //   System.out.println(10 + 20 + "Hello"); 

    //   System.out.println('A');
    //   System.out.println('A' + 'A');
    //   System.out.println('A' + 10);

    //   int a = 'A';
    //   System.out.println(a);

      // byte short int long float double
     int f = 20;
     double ft = f;
     System.out.println(ft);

      double d = 20.56;
      int b = (int)d;
      System.out.println(b);

      Integer a = Integer.valueOf(20);
      System.out.println(Integer.MIN_VALUE);
      Integer.min(1,2);

      // Convert from String to int
      String str = "12345";
      int tmp = Integer.parseInt(str);

      int num = 0;
      for(int i=0; i<str.length(); i++){
           int tr = str.charAt(i)-'0';
           num = num*10 + tr;
      }

      System.out.println(num);
      System.out.println(num + 10);
    }
}