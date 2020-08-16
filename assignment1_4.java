package test;


class circle{
    private double radius = 1.0;
    private String color = "red";

    public circle(){

    }
    public circle(double radius){
        this.radius  = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return 3.1428*this.radius*this.radius;
    }
}

public class assignment1_4 {

}
