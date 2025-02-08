class a{
    void disp(){
        System.out.println("METHOD OVERLOAD");}
    void disp(int p){
        System.out.println("p="+p);}
    void disp(int p, int q){
        System.out.println("p="+p+"  q="+q);}
    void disp(int p, double q){
        System.out.println("p="+p+"  q="+q);}
    void disp(double q, int p){
        System.out.println("p="+p+"  q="+q);}
    void disp(double p, double q){
        System.out.println("p="+p+"  q="+q);}
    }
    
class method_overload{
    public static void main(String args[]){
        a ob = new a();
        ob.disp();
        ob.disp(100);
        ob.disp(200,300);
        ob.disp(400,500);
        ob.disp(600,700.77);
        ob.disp(800.88,900.99);
    }
}