interface Drawable{
	void draw();
}


class Rectangle implements Drawable{
	public void draw(){
	System.out.println("drawing rectangle");
}	
	}

class Circle implements Drawable{
	public void draw(){
		System.out.println("drawing circle");
}
}
class Testinterface{
	public static void main(String args[]){
		Drawable d =new Rectangle();
	Drawable d1 =new Circle();

		d.draw();
		d1.draw();
}
}