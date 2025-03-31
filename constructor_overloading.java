class constructor_overload {
    int x,y;
    constructor_overload(){
        x = 10;
        y = 20;
    }
    constructor_overload(int a){
        x = y = a;
    }
    constructor_overload(int q, int r){
        x = q;
        y = r;
    }
    constructor_overload(constructor_overload ob){
        x = ob.x;
        y = ob.y;
    }
    void show(){
        System.out.println("X = "+x+" Y = "+y);
    }
}
public class constructor_overloading{
    public static void main (String a[]){
        constructor_overload ob = new constructor_overload();
        constructor_overload ob1 = new constructor_overload(100);
        constructor_overload ob2 = new constructor_overload(200,300);
        constructor_overload ob3 = new constructor_overload(ob2);
        
        ob.show();
        ob1.show();
        ob2.show();
        ob3.show();
    }
}
