public  class ThreadExample implements Runnable{
  @Override
     public void run() {
for(int i=0; i<10; i++){
		System.out.println("i=" +i);

}
  }
public static void main(String[]args){  
ThreadExample obj=new ThreadExample();
ThreadExample obj2=new ThreadExample();
Thread t1=new Thread(obj);
Thread t2=new Thread(obj2);

t1.start();
t2.start();
}

}