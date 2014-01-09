/*Refined Abstraction类*/


public class CProgram extends Program {


	public CProgram(Programmer programmer) {
		super(programmer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.getProgrammer().program();
		System.out.println(" C program.");
	}

}
