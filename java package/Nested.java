class Nested{
public static void main(String[] args){
try{
try{
System.out.println("Dividing...");
int b= 39/0;
}catch(ArithmeticException e){System.out.println(e);}
try{
int a[] = new int[5];
a[5]=4;
}catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
System.out.println("other stetement");
}catch(Exception e){System.out.println("Exception handled");}
System.out.println("Normally other codes will exeute...");
}
}
				