package Exception_Handeling;

/**
 *
 * @maraz
 */
public class Throw_Example {
    void checkAge(int age){  
	if(age<18)  
	   throw new ArithmeticException("Not permitable for viewing this site");  
	else  
	   System.out.println("You are permitted");  
   }  
   public static void main(String args[]){  
	Throw_Example obj1 = new Throw_Example();
        Throw_Example obj2 = new Throw_Example();
	obj1.checkAge(19);  
	System.out.println("End Of Program");
        obj2.checkAge(11);
   }  
}
