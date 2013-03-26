
public class Server {
	import org.omg.CORBA.ORB;
	import org.omg.CosNaming.NameComponent;
	import org.omg.CosNaming.NamingContextExt;
	import org.omg.CosNaming.NamingContextExtHelper;
	import org.omg.PortableServer.POA;
	import org.omg.PortableServer.POAHelper;
	import filebox.filePOATie;
	import filebox.userPOATie;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			ORB orb = ORB.init(args, null);
			POA root = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
	        root.the_POAManager().activate();
	        
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
