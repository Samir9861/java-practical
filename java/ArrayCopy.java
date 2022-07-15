public class ArrayCopy{

	public static void main(String[]args){

	char[] copyFrom = {'s','a','m','i','r'};
	char[] copyTo = new char[5];
	

	System.arraycopy(copyFrom, 2, copyTo,2 ,3);
	System.out.println(String.valueOf(copyTo));










}
}