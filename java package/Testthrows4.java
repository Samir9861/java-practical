//  Program if exception occurs
import java.io.*;
class M1{
   void method()throws IOException{
	throw new IOException("device error");
    }
 }

class Testthrows4{
    public static void main(String[] args) throws IOException{

	 M1 obj=new M1();
	obj.method();

System.out.println("normal flow...");
 }
}