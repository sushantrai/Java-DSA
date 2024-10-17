package Lec40;

public class abstract_implementation extends abstract_demo{
    public void fun()
    {

    }
    public void saybye()
    {

    }
    public static void main(String[] args) {
        abstract_implementation abs=new abstract_implementation();
            abs.fun();
            abs.saybye();
            abs.sayhey();
            abstract_demo abs1=new abstract_demo() {
                
            };
    }
}