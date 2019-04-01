package Exception_Handeling;

public class Throws_Example {
    int division(int a, int b) throws ArithmeticException{  
	int t = a/b;
	return t;
   }  
   public static void main(String args[]){  
	Throws_Example obj = new Throws_Example();
        Throws_Example obj1 = new Throws_Example();
	try{
	   System.out.println(obj.division(18,0));  
	}
	catch(ArithmeticException e){
	   System.out.println("You shouldn't divide number by zero");
	}
        try{
	   System.out.println(obj1.division(110,10));  
	}
	catch(ArithmeticException e){
	   System.out.println("You shouldn't divide number by zero");
	}
   }  
}
