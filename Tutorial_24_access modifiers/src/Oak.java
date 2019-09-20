
public class Oak extends Plant {
	
public Oak(String name) {
		super(name);
		System.out.println("The public name from subclass is "+this.name);
		System.out.println("THe protected size from the subclass is "+this.size);
}

}