
public class MainClass extends Thread {

	public static void main(String arg[]) throws Exception
	{
		CustomThread t1=new CustomThread("1st Thread");
		CustomThread t2=new CustomThread("2nd Thread");
		CustomThread t3=new CustomThread("3rd Thread");
		// If t is a Thread object whose thread is currently executing, then t.join() 
		// will make sure that t is terminated before the next instruction is executed by the program.
		t1.start();
		
//		t2.setPriority(100);
//		t1.setPriority(50);
//		t3.setPriority(75);
		/*
		 * If we don't use join, the output will be, then thread t2 or t3 won't wait to end thread t1.
			Current Thread 2nd Threadstarted
			Current Thread 1st Threadstarted
			Current Thread 3rd Threadstarted
			Current Thread 1st Thread ended
			Current Thread 2nd Thread ended
			Current Thread 3rd Thread ended
		 * 
		 */
		/* After we use join on thread, once thread t1 ends then only t2 start and followed by thread t3
			Current Thread 1st Threadstarted
			Current Thread 1st Thread ended
			Current Thread 2nd Threadstarted
			Current Thread 2nd Thread ended
			Current Thread 3rd Threadstarted
			Current Thread 3rd Thread ended
		 */
		System.out.println(t1.isAlive());//t1 is still active
		t1.join();
		System.out.println(t1.isAlive());// after join, t1 is dead
		t2.start();
		t2.join();
		t3.start();
		
	}
}
