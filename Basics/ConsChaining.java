package Basics;

class Parent{

    Parent(){

    }
}

class Base{
   Base(){

    }
   Base(int n){

   }
}

public class ConsChaining {
    public static void main(String[] args) {
         Base obj = new Base();

         Base obj2 = new Base(10);
    }
}
