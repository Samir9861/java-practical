class NestedTry{

	public static void main(String[] args){
   try{
      try{
      
     System.out.println("Dividing…..");
   int b =39/0;
      
         }catch(ArithmeticException e){  
System.out.println(e);
 }
          
     try{
int a[]=new int[5];
      a[5]=4;
          }catch(ArrayIndexOutOfBoundsException e){
         System.out.println(e);
}
             System.out.println("other statement");
                   }catch(Exception e){
                            System.out.println("Exception handeled");
                        }
                         System.out.println("Normally other codes will execute…..");
    }
}
