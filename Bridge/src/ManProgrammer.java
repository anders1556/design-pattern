/* ConcreteImplementor */

public class ManProgrammer implements Programmer{
	
	private String name;
	private String sex;

	public ManProgrammer(String name)
    {
        this.sex  = "Male";
        this.name = name;
    }

	@Override
	public void program() {
		// TODO Auto-generated method stub
		System.out.print(this.name + " " + " is 扣腚");
	}
}
