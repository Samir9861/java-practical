class PassByValueAndReference{
	int x;
	String str;

	PassByValueAndReference(){
	x = 10;
	str="world";
}
	
	

    
    public void changeValue(int x, String str){ 
        x = 100;
        str = "country";
    }
    
    public void changeValue2(PassByValueAndReference ref){
        ref.x = 100;
        ref.str = "stars";
    }
    
    public static void main(String[] args) {
        PassByValueAndReference obj = new PassByValueAndReference();
        
        System.out.println("obj.x = "+obj.x);
        System.out.println("obj.str = "+obj.str);
        
        obj.changeValue(obj.x, obj.str); // pass by value
        System.out.println("==========after sending values===============");
        System.out.println("obj.x = "+obj.x);
        System.out.println("obj.str = "+obj.str);
        
        System.out.println("=============after sending object==========");
        obj.changeValue2(obj);//pass by reference
        System.out.println("obj.x = "+obj.x);
        System.out.println("obj.str = "+obj.str);

        
    }
    
    
    }
    


