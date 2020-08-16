package test;

import java.util.Scanner;

public class assignment1_1 {
    interface add{
        public int add(int a,int b);
    }
    interface difference {
        public int difference(int a,int b);
    }
    interface product{
        public int product(int a,int b);
    }
    interface safeDivision{
        public float safeDivision(float a, float b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        add add = (int a,int b)-> a+b;
        difference difference = (int a,int b) -> a-b;
        product product = (int a,int b)->a*b;
        safeDivision division = (float a, float b)->{
            try{
                if(b == 0){
                    throw new ArithmeticException();

                }
               return a/b;
            }catch (ArithmeticException e){
                System.out.println("Denominator cannot be zero");
                e.printStackTrace();
            }
            return 0;
        };

        System.out.println(division.safeDivision(10f,2f));
        System.out.println(add.add(10,2));
        System.out.println(difference.difference(10,2));
        System.out.println(product.product(10,10));
    }
}
