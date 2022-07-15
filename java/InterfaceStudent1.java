Interface Student1{  ​

	void print();  ​

	}  ​

​

		class Student implements Student1{  ​

		public void print(){​

	System.out.println("=============I am a student ===============");

	}  ​

  ​

		public static void main(String[]args){  ​

		Student obj =new Student();  ​

		obj.print();  ​

 }  ​

} ​