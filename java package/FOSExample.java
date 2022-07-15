import java.io.FileOutputStream;

    public class FOSExample{
   
      public static void main(String[]args){
      
          try{
       
       FileOutputStream fos=new FileOutputStream("D:\\student.txt");
           fos.write(65); //A=65
        fos.closed();

		System.out.println("writing sucessful...");
              }catch(Exception e){
            System.out.println(e);
}
}
}