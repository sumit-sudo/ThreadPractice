
public class CustomThread {

	
	synchronized public void countNumber(int data)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(data*i);
		}
	}
}



class Thread1 extends Thread{
	CustomThread obj=new CustomThread();
	public void run()
	{
		obj.countNumber(1);
	}
	
	
	
}
class Thread2 extends Thread{
	
	CustomThread obj=new CustomThread();
	public void run()
	{
		obj.countNumber(10);
	}
	
	
	
}