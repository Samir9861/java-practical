public class FirstClass{
	protected int x;
	  protected int y;

public FirstClass(){
this.x = 20;
this.y = 40;
}
  	public void Display(){
		System.out.println("x = " +x);
		System.out.println("y = " +y);
}

public static void main(String args[]) {
FirstClass obj = new FirstClass();
obj.Display();
obj.x = 50;
obj.y = 60;
obj.Display();
}
}

	