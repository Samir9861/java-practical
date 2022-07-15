import java.util.Scanner;
public class  PassingArray {

		public void getData(int[] org){
	System.out.println("enter number :");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<org.length;i++){

		org[i] =sc.nextInt();
}


}
		public void displayData(int[] data){
		for(int i=0;i<data.length;i++){
		System.out.println(data[i]);
}
}



public static void main(String[]args){

int []arr=new int [10];
PassingArray obj =new PassingArray();
obj.getData(arr);
obj.displayData(arr);
}
}