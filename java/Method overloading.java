class Methodoverloading{
	Methodoverloading(){
}

	void welcome(){
		sysytem.out.println("welcome ");

}

void welcome (string firstName,String lastName){
		sysytem.out.println("my name is :" +firstName+ " "+lastName);

}
void welcome(int a){
		sysytem.out.println("age is "+a);

}


public static void main(string[] args){

	Methodoverloading obj=new Methodoverloading();
	obj.welcome();
	obj.welcome("samir", "karki");
	obj.welcome(20);
	
}
}