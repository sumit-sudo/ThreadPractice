

/*
 * To achieve Multiple task from Multiple thread, We create multiple classes and each class contain 
 * one run method to perform task.
 * we can call each run method by creating of object of run method class inside main, thus we will achieve
 * multiple tasking.
 */
public class MultiThreading implements Runnable{

	public MultiThreading(String str)
	{
		Thread t1=new Thread(this, str);
	}

	@Override
	public void run() {
		System.out.println("task1");
		
	}
	
}
 class MultiThreading2 implements Runnable{

	public MultiThreading2(String str)
	{
		Thread t1=new Thread(this, str);
	}

	@Override
	public void run() {
		System.out.println("task2");
		
	}
	
}
 class MultiThreading3 implements Runnable{

	public MultiThreading3(String str)
	{
		Thread t1=new Thread(this, str);
	}

	@Override
	public void run() {
		System.out.println("task3");
		
	}
	
}
 class MultiThreading4 implements Runnable{

	public MultiThreading4(String str)
	{
		Thread t1=new Thread(this, str);
	}

	@Override
	public void run() {
		System.out.println("task4");
		
	}
	
}
