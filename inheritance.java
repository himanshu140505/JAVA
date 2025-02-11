class A{
    A(){
    System.out.println("CLASS A DEFAULT");
    }
    void show(){
        System.out.println("Class A Show method");
    }
}

class B extends A{
    B(){
    System.out.println("CLASS B DEFAULT");
    }
    void show(){
        System.out.println("Class B Show method");
    }
}

class inheritance {
    public static void main(String[] args) {
        A ob = new A();
        ob.show();
        System.out.println("");
        A ob1 = new B(); //Dynamic method Dispatch
        ob1.show();
    }
}
