package state.designer.modle;

public class Client {
	
	public static void main( String[] args){
		
		TCPStateInter state = new TCPListen();
		Context context = new Context();
		context.setState(state);
		context.open(TCPState.LISTEN.toString());		
	}
}
