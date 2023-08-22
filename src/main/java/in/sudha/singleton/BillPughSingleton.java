package in.sudha.singleton;

public class BillPughSingleton {

	private BillPughSingleton() {}
	
	//nested class
	private static class SingletonHelper{
		private static final BillPughSingleton onlyOneInstace = new  BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		return SingletonHelper.onlyOneInstace;
	}
}
//Pros:Best implementation and Industry Standard
class Main5{
	  public static void main(String[] args) {
		  LazyInitialisation e1 = LazyInitialisation.getInstance();
		  LazyInitialisation e2 = LazyInitialisation.getInstance();
		  if(e1 == e2) {
				System.out.println("Same Objects BillPughSingleton");
			}else {
				System.out.println("Different Objects");
			}

	}
	}

