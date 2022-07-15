public class Array{
	public static void main(String[]args){
	
		int marks[]=new int[]{44,45,33,98,55,10,88,66,55,42};

			
	int temp;
	for(int i=0 ; i<10; i++){
		for(int j=i; j<10;j++){
        if(marks[i] > marks[j]) {
		
	   temp = marks[i] ;
marks[i]=marks[j];
marks[j]=temp;
}


}	

		}
for(int i=0 ; i<marks.length; i++){
		
			System.out.println(marks[i]);	
				
				}

}
}