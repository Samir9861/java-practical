package one;
	public class Practice{

	public String name;
	public int age;

	public Practice(){

	this.name="Samir";
	this.age=24;
}
 public void Display(String name,int age){
System.out.println("name : =" + name);
System.out.println("age : =" + age);
}

		
public static void main(String args[]){
	 Practice obj = new Practice();
	 System.out.println("your details is");
System.out.println("your name is : " +obj.name);

System.out.println("your age is : " +obj.age);

	
	obj.name="ram";
	obj.age=30;

	
}
}