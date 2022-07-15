
public class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}

public class BabyDog extends Dog{
     void weep(){
	System.out.println("weeping...");
	}
}
 public class TestInheritance {
    public static void main(String[] args) {
        BabyDog obj=new BabyDog();
	obj.weep();
	obj.bark();
        obj.eat();
    }
 
}