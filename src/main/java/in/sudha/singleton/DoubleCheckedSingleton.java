package in.sudha.singleton;

public class DoubleCheckedSingleton {
	
	private static DoubleCheckedSingleton onlyOneInstance;
	
	private DoubleCheckedSingleton() {}
	
	public static DoubleCheckedSingleton getInstance() {
	 
		if(onlyOneInstance == null) {
			
			synchronized (DoubleCheckedSingleton.class) {
				
				if(onlyOneInstance == null) {
					onlyOneInstance = new DoubleCheckedSingleton();
				}
				
			}
		}
		
		return onlyOneInstance;
	}

}

//Pros :   Better Performance
//cons: Performance is better till the first object is created
class Main4{
	  public static void main(String[] args) {
		  LazyInitialisation e1 = LazyInitialisation.getInstance();
		  LazyInitialisation e2 = LazyInitialisation.getInstance();
		  if(e1 == e2) {
				System.out.println("Same Objects DoubleChecked");
			}else {
				System.out.println("Different Objects");
			}

	}
	}

