import java.io.IOException;
import java.lang.Exception;
import java.util.*;
	class TestingThrows1{
		void m()throws IOException{
			throw new IOException("device error");

               }
	void n()throws IOException{
	m();
	}
            void p(){
           try{
 n();
  }
   catch(Exception e)
{
    System.out.println("exception handelled");
 }
 }
     public static void main(String []args){
        TestingThrows1 obj=new TestingThrows1();
          obj.p();
             System.out.println("normal flw");
      }
  }