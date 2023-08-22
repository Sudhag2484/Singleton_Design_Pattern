package in.sudha.singleton;

public class EagerInitialisation {

    private static  EagerInitialisation OnlyOneinstance = new EagerInitialisation();

    private EagerInitialisation() {
    }

    public static EagerInitialisation getInstance() {
        return OnlyOneinstance;
    }
}
//Pros :Only one obj is created
//cons: Exception not handle
class Main {

    public static void main(String[] args) {

        EagerInitialisation e1 = EagerInitialisation.getInstance();
        EagerInitialisation e2 = EagerInitialisation.getInstance();

        if (e1 == e2) {
            System.out.println("Both are the same Object Eager-Intial");
        } else {
            System.out.println("Both are Not the Same Object");
        }
    }
}
