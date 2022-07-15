class ConstructorOverloading{

	String name;
	String grade;	
	int roll;
		
	ConstructorOverloading(){
	name = "Samir";
	grade = "Seventhsem";
	roll = 15;
	
	}

	ConstructorOverloading(String name,String grade,int roll){
	this.name = name;
	this.grade = grade;
	this.roll = roll;	
}
public static void main (String[]args){
ConstructorOverloading obj=new ConstructorOverloading();
ConstructorOverloading obj1=new ConstructorOverloading("Aayush","Seventhsem",2);
	
	System.out.println("name is = "+obj.name);
System.out.println("grade is = "+obj.grade);
	System.out.println("roll number is = "+obj.roll);
	

	System.out.println("second name is = "+obj1.name);
System.out.println("grade is = "+obj1.grade);
System.out.println("roll number is = "+obj1.roll);
}
}