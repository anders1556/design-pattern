package state.designer.modle;

public class Context {
	
	private TCPStateInter state;
	
	public void setState(TCPStateInter state){
		this.state = state;
	}
	
	public void open(String c){
		state.open(c);
	}	
}
