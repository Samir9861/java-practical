class ConstructorOverloading1{

	String language;


	ConstructorOverloading1(){
	language="nepali";
}


	ConstructorOverloading1(String language){
	this.language=language;
	
	}
public static void main (String[]args){
	ConstructorOverloading1 obj=new ConstructorOverloading1();
	ConstructorOverloading1 obj1=new ConstructorOverloading1("english");

	System.out.println("my language is = " +obj.language);
	System.out.println("my language is = " +obj1.language);
}
}