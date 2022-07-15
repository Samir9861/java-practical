class BanepaCSIT {
public  BanepaCSIT(){
}
void display(){
        System.out.println("Welcome to java practice!!");
    }
    
    void display(String name){
        System.out.println("Welcome to java practice!! " + "hello!! "+name);
    }
    void display(String placename, String toll){
        System.out.println( placename+"  "+toll);
    }
    
    void display(int x){
        System.out.println("supplied age is = "+x);
    }
    
    public static void main(String[] args) {
       
        BanepaCSIT b1 = new BanepaCSIT();
        
        b1.display();
        b1.display("samir");
        b1.display("Banepa", "basdol");
        b1.display(23);

    }
    
}