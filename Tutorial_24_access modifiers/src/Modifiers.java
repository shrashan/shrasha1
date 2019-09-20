

//public-from everywhere
//private-same class only i.e within the curly brackets, not extended subclass or the different packages
//protected-same class and subclass and same package only and cannot be accepted outside of the package.
// no modifier-can be accessed within same package only.
public class Modifiers {

	public static void main(String[] args) {
		
		Plant plant1=new Plant("oaky");
		plant1.displayInfo();
		
		Oak oak1= new Oak("Ross");
		plant1.name="rashan";
		 
		System.out.println("the print of public name from main "+plant1.name);
		
System.out.println("The protected from the same  package bur from main is "+plant1.size);
	
	

	}
}
