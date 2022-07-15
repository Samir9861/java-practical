class Methodoverloading{
	Methodoverloading(){
}

	void welcome(){
		System.out.println("welcome ");

}

void welcome (String firstName,String lastName){
		System.out.println("my name is :" +firstName+ " "+lastName);

}
void welcome(int a){
		System.out.println("age is "+a);

}


public static void main(String[] args){

	Methodoverloading obj=new Methodoverloading();
	obj.welcome();
	obj.welcome("samir", "karki");
	obj.welcome(20);
	
}
}