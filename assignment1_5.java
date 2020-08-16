package test;

class complex{
    int real;
    int imaginary;

    public complex(int real , int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public complex add(complex b){
        return new complex(this.real+b.real,this.imaginary+b.imaginary);
    }
    public complex subtract(complex b){
        return new complex(this.real-b.real,this.imaginary-b.imaginary);
    }
    public complex multiply(complex b){
        return new complex( this.real*b.real - this.imaginary*b.imaginary , this.imaginary*b.real + this.real*b.imaginary);
    }
    public String toString(){
        return String.format("Real > %d : Imaginary > %d",this.real,this.imaginary );
    }
}
public class assignment1_5 {

    assignment1_5(){
        complex a = new complex(1,2);
        complex b = new complex(3,4);
        System.out.println((a.add(b)).toString());
        System.out.println((a.subtract(b)).toString());
        System.out.println((a.multiply(b).toString()));


    }

    public static void main(String[] args) {
        assignment1_5 test = new assignment1_5();
    }
}
