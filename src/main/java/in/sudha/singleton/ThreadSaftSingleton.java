package in.sudha.singleton;

public class ThreadSaftSingleton {
	
	private static ThreadSaftSingleton onlyOneInstance;
	
	private ThreadSaftSingleton() {}
	
	
	public static  synchronized ThreadSaftSingleton getInstance() {
		if(onlyOneInstance == null) {
			onlyOneInstance = new ThreadSaftSingleton();
		}
		return onlyOneInstance;
	}

}


//Pros : handle Multiple threads
//cons: Performance is Slow
class Main3{
	  public static void main(String[] args) {
		  LazyInitialisation e1 = LazyInitialisation.getInstance();
		  LazyInitialisation e2 = LazyInitialisation.getInstance();
		  if(e1 == e2) {
				System.out.println("Same Objects threadSafe");
			}else {
				System.out.println("Different Objects");
			}

	}
	}
