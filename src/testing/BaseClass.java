package testing;

public class BaseClass {
    private  void base(){
        System.out.println("base class");
    }
    void  anothorbase(){
        System.out.println("Anothre Base");
    }

    public static void main(String[] args) {
        BaseClass p = new Derived2();

    }

}
class  Derived2 extends  BaseClass{
void foo(){
    System.out.println("Derived");
}
}