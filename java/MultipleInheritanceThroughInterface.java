public class MultipleInheritanceThroughInterface extends BanepaCSIT implements FirstInterface, SecondInterface{

    
    @Override
    public void display() {
        super.display();
        System.out.println("Hello Banepa !!!!");
    }

    @Override
    public int sum(int x, int y) {
     return (x+y);   
    }

    @Override
    public double product(double x, double y) {
           return x*y;
    }
    
    
    public static void main(String[] args) {
        MultipleInheritanceThroughInterface obj = new MultipleInheritanceThroughInterface();
       
        obj.display();
        obj.display("Ram");
        
        int result = obj.sum(5, 10);
        System.out.println("sum = "+result);
        
        double product = obj.product(5.0, 10.0);
        System.out.println("product = "+product);
        
        
        
        
        
    }
}