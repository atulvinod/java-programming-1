package test;

import java.util.Scanner;

class Triangle{
    public float getArea(float a, float b, float c){
        float s = (a+b+c)/2f;

        //Using heron's formula
        double area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        return (float)area;
    }
}
public class assignment1_7 {

    assignment1_7(){
        Triangle t = new Triangle();
        Scanner scan = new Scanner(System.in);
        float  a = scan.nextFloat();
        float b =  scan.nextFloat();
        float c = scan.nextFloat();
        System.out.println(t.getArea(a,b,c));
    }

    public static void main(String[] args) {
        assignment1_7 test = new assignment1_7();
    }

}
