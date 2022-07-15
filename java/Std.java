interface stdinfo{
	void print();
}

	class Std implements stdinfo{
		public void print(){
		System.out.println(" ==========I am a student============= ");
}
		
		public static void main(String[]args){
			Std obj =new Std();
			obj.print();
}
}