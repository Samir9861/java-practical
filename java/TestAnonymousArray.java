public class TestAnonymousArray{
	static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
}
public static void main(String[]args){
	TestAnonymousArray obj = new TestAnonymousArray();
	obj.printArray(arr);
}
}