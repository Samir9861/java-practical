


class Dog extends Animal1{
     void bark(){
	System.out.println("dog will bark...");
	}
}

class Cat extends Dog{
     void meow(){
	System.out.println("cat will do meow...");
	}
}

 
 public class HierarchicalInheritance {
    

		public static void main(String[] args) {
        	Cat obj=new Cat();
		obj.meow();	
		obj.bark();
        	obj.eat();
	
    }
 
}