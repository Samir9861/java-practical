class Constructor{
	
int x;
int y;
String=name;
  Constructor() {
x = 10;
y = 20;
}

  Constructor(int x, int y) {
this.x = x;
this.y = y;
}
 Constructor(String name){
System.out.println("hellow its me :");
name="samir";
}


 public static void main(String[] args) {
Constructor obj = new Constructor();
System.out.println("x = " + obj.x);
System.out.println("y = " + obj.y);

System.out.println("*********************");
Constructor obj1 = new Constructor(30, 40);
System.out.println("x = " + obj1.x);
System.out.println("y = " + obj1.y);

System.out.println("**********************");
Constructor obj2 = new Constructor("obj.name");


}
}
	
