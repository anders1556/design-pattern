
/* Client类 */

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Programmer brother_chao = new ManProgrammer("BrotherChao");
		Programmer xiao_meng = new WomanProgrammer("XiaoMeng");
		
		Program j = new JavaProgram(brother_chao);
		j.run();
		
		Program c = new CProgram(xiao_meng);
		c.run();

	}

}
