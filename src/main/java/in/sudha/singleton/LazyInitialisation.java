package in.sudha.singleton;

public class LazyInitialisation {
	
	private static LazyInitialisation onlyOneInstance;
	
	private LazyInitialisation() {}
	
	
	public static LazyInitialisation getInstance() {
		if(onlyOneInstance == null) {
			onlyOneInstance = new LazyInitialisation();
		}
		return onlyOneInstance;
	}

}
//Pros :obj is created when required
//cons: Cannot handle Multiple threads
class Main2{
  public static void main(String[] args) {
	  LazyInitialisation e1 = LazyInitialisation.getInstance();
	  LazyInitialisation e2 = LazyInitialisation.getInstance();
	  if(e1 == e2) {
			System.out.println("Same Objects LazyInitial");
		}else {
			System.out.println("Different Objects");
		}

}
}