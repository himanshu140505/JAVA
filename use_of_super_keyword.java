class a{
    int x = 50;
    a(){
        System.out.println("x = "+x);
    }
}
class b extends a{
    int y = 70;
    b(){
        System.out.println("y = "+y);
    }
}
class c extends b{
    int z = 100;
    c(){
        System.out.println("z = "+z);
    }
}
class use_of_super_keyword{
    public static void main(String[] args) {
        c ob = new c();              
    }
}

