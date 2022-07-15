

 class BabyDog extends OldDog{
     void weep(){
	System.out.println("dog will weep...");
	}
}

 
 public class TestInheritance {
    public static void main(String[] args) {
        BabyDog obj=new BabyDog();
obj.sleep();	
obj.weep();
	obj.bark();
        obj.eat();
	
    }
 
}