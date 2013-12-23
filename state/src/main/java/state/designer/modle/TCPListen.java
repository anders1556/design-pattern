package state.designer.modle;

public class TCPListen implements TCPStateInter{
	public void open(String c) {
		System.out.println(" the state is : " + c + " ! ");
	}
	
}
