
public class CustomThread extends Thread{

	public CustomThread(String str)
	{
		super(str);
	}
	public void run()
	{
	
		System.out.println("Current Thread " + Thread.currentThread().getName() + "started");
		
		System.out.println("Current Thread " + Thread.currentThread().getName()+" ended");
	}
}
