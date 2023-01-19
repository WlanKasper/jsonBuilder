package jsonGen.main;

public class Main {

	public static void main(String[] args) {
		try {
			new Console().exec2();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
