import java.util.Scanner;

class Robot{
	private String name;
	private int memory;
	
	public Robot() {
		this("ram",45);
		
		System.out.println("The name of the Robot is "+name+" and its memory is "+memory+" GB");
		name="Rashan";
				memory=32;
	}
	public String getName(){
		return name;
	}
	public int getMemory() {
		return memory;
	}
	
	public Robot(String name, int memory) {
		this.name=name;
		this.memory=memory;
		
	}

public String getNamee(){
	return name;
}
public int getMeemory() {
	return memory;
}

	
}
public class Constructorss {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		Robot robo1=new Robot();
		System.out.println("The name of the robot is "+robo1.getName());
		System.out.println("The memory of the robot is "+robo1.getMemory());
		
		Robot robo2=new Robot("sam",64);
		System.out.println("The name of the robot is "+robo2.getNamee());
		System.out.println("The memory of the robot is "+robo2.getMeemory());
		
		System.out.println("done some changes from ecllipse after importing from github and pushing the changes to github");
		System.out.println("only changes in branch");
		
		
	}

}
