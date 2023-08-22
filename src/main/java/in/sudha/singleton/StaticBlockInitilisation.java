package in.sudha.singleton;

public class StaticBlockInitilisation {

	private static StaticBlockInitilisation onlyOneInstance;
	
	private StaticBlockInitilisation() {}
	
	static {
		try {
			onlyOneInstance=new StaticBlockInitilisation();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static StaticBlockInitilisation getInstance() {
		return onlyOneInstance;
	}
}
//Pros : Exception handle
//cons: Always obj is created 
class Main1{
	
	public static void main(String[] args) {
		StaticBlockInitilisation e1 = StaticBlockInitilisation.getInstance();
		StaticBlockInitilisation e2 = StaticBlockInitilisation.getInstance();
		
		if(e1 == e2) {
			System.out.println("Same Objects StaticBlock");
		}else {
			System.out.println("Different Objects");
		}

	}
}