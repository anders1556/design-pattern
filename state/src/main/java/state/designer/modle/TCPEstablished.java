package state.designer.modle;

public class TCPEstablished implements TCPStateInter{

	public void open(String c) {
		System.out.println(" the state is : " + c + " ! ");
	}

}
