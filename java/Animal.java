 class Animal{
  void eat(){
        System.out.println("dog will eat....");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("dog will bark...");
    }
}
class OldDog extends Dog{
    void sleep(){
        System.out.println("dog will sleep...");
    }
}