
public class MainClass {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		t1.start();
		Thread2 t2=new Thread2();
		t2.start();
		/*
		 *until t2 exit, t1 won't be able to enter to synchronized method countNumber().
			10
			20
			30
			40
			50
			1
			2
			3
			4
			5

		 */
	}

}
