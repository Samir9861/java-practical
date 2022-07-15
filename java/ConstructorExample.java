
package banepacsit;

public class ConstructorExample {
    // define three instance variable
    int x;
    int y;
    String name;
    
    public ConstructorExample(){
        x = 20;
        y = 30;
        name = "aayush";
    }
    
    public ConstructorExample(int x, int y, String name){
        
        this.x = x;
        this.y = y;
        this.name = name;
               
    }
    
    public ConstructorExample(String name){
        System.out.println("name = "+name);
    }
    
    public static void main(String[] args) {
        ConstructorExample obj = new ConstructorExample();
        ConstructorExample obj2 = new ConstructorExample(50,70,"barsha");
        ConstructorExample obj3 = new ConstructorExample("ganesh");
       
        
        System.out.println("obj.x = "+obj.x);
        System.out.println("obj2.x = "+obj2.x);
        
//        System.out.println(x);
    }
    
    
    
    
}
