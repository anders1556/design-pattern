/*Refined Abstraction类*/

public class JavaProgram extends Program {

	public JavaProgram(Programmer programmer) {
		super(programmer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.getProgrammer().program();
		System.out.println(" Java program.");
	}

}
