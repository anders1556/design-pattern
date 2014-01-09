
/*Abstraction类*/

public abstract class Program {
	
	private Programmer programmer;
	
	public Program(Programmer programmer){
		
		this.programmer = programmer;
	}
	
	public Programmer getProgrammer(){
		return this.programmer;
	}
	
	public void setProgrammer(Programmer programmer){
		this.programmer = programmer;
	}
	
	public abstract void run();

}
