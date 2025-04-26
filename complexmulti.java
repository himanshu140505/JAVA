import java.util.*;
import java.io.*;

class Complex{
    int real;
    int img;
    void setvalue(int r, int i){
        real = r;
        img = i;
    }
    static Complex Multi(Complex c1, Complex c2){
        Complex result = new Complex();
        result.real = (c1.real * c2.real) - (c1.img * c2.img);
        result.img = (c1.real * c2.img) + (c1.img * c2.real);
        return result;
    }
    void display(){
        if(img < 0){
            System.out.println(real + " - " + Math.abs(img) + "i");
        } else {
            System.out.println(real + " + " + img + "i");
        }
    }
}

class complexmulti{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        int r1, i1, r2, i2;
        System.out.println("Enter the real and imaginary part of first complex number:");
        r1 = sc.nextInt();
        i1 = sc.nextInt();
        System.out.println("Enter the real and imaginary part of second complex number:");
        r2 = sc.nextInt();
        i2 = sc.nextInt();
        c1.setvalue(r1, i1);
        c2.setvalue(r2, i2);
        Complex result = Complex.Multi(c1, c2);
        System.out.print("The product of the two complex numbers is: ");
        result.display();
    }
}