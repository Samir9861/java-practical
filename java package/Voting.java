import java.util.Scanner;
class ThrowsException extends RuntimeException {
  
    ThrowsException(String msg){
super(msg);

}
}
class Voting{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
		System.out.println("enter your age: ");
	int age=sc.nextInt();
		if(age<18){
throw new ThrowsException("you are not qualified for votting");
	}
	else{
		System.out.println("welcome to voting site");
	 }
       }
     }