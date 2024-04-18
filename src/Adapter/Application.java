package Adapter;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adapter target = new AdapterImpl();
		
		System.out.println(target.twiceOf(100.0f));
		System.out.println(target.halfOf(100.0f));
	}

}
