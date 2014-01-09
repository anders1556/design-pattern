
/* ConcreteImplementor */

public class WomanProgrammer implements Programmer{
	
	private String name;
	private String sex;

	public WomanProgrammer(String name)
    {
        this.sex  = "Female";
        this.name = name;
    }

	@Override
	public void program() {
		// TODO Auto-generated method stub
		System.out.print(this.name + " " + " is 扣腚");
	}

}
