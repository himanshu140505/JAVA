interface  A{
    void show();
}

interface B {
    void disp();
}

class C implements A, B{
    public void show(){
        System.out.println("A");
    }
    public void disp(){
        System.out.println("B");
    }
}
class use_of_interface {
    public static void main(String args[]){
        A ob = new C();
        ob.show();
        ((B)ob).disp();
    }
    
}
