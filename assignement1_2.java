package test;

import java.util.Scanner;

class Base{
    int height, width;
    public Base(){
        this.height = 0;
        this.width = 0;
    }
    public void display(){
        System.out.println(width +" "+height);
    }

}
public class assignement1_2 extends Base{

    Scanner scan;
    public assignement1_2(){
        scan = new Scanner(System.in);
    }


    public void read_input(){
        height = scan.nextInt();
        width = scan.nextInt();
    }
    public void display(){
        System.out.println(height*width);
    }

    public static void main(String[] args) {
        assignement1_2 rectangle = new assignement1_2();
        rectangle.read_input();
        System.out.println(rectangle.width + " "+ rectangle.height);
        rectangle.display();
    }
}
