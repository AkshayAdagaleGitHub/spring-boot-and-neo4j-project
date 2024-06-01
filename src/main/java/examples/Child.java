package examples;

public class Child extends Base{

    public Child(){
        super();
//        this.baseClassMethod();
    }

    public void baseClassMethod(){
        System.out.println("Base Class Method called from Child Class ");
    }
}
