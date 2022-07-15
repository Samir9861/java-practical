// program if exception doesnot occur

import java.io.*;
class M{
   void method()throws IOException{
	System.out.println("device operation performed"); 
    }
 }

class Testthrows1{
    public static void main(String[] args) throws IOException{

	 M obj=new M();
	obj.method();

System.out.println("normal flow...");
 }
}