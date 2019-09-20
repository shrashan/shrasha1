
public class Plant {
	
	public String name;
	private int age=23;
	protected double size=50.03;
	
	public Plant(String name) {
		
		this.name=name;
	}
	
public void displayInfo() {
	System.out.println("The privagte age from same class  is "+this.age); 
	System.out.println("The public name from same class is "+this.name);
System.out.println("The protected size from same calss is "+this.size);
}
	

}
