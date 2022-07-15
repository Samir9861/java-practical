class Student{
	String name;

	Student(){
	name="unknown";
	}
		Student(String name){
		this.name=name;
	}

	public static void main (String[]args){
	Student obj=new Student();
	Student obj1=new Student("samir");

		System.out.println(obj.name);
		System.out.println(obj1.name);
		

}
}