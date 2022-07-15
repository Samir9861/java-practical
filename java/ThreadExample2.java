public class ThreadExample2 implements Runnable{
  @Override
     public void run() {
for(int i=0; i<10; i++){
		System.out.println("i=" +i);


try{
Thread.sleep(100);
}catch(Exception e){
}
  }
}
public static void main(String[]args){

 ThreadExample2 t1=new Thread(obj);
 ThreadExample2 t2=new Thread(obj2);

t1.start();
t2.start();
}

}