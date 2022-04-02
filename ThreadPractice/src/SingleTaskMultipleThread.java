
public class SingleTaskMultipleThread implements Runnable{

	Thread obj=null;
	public SingleTaskMultipleThread(String str)
	{
		// THread class has two constructor 
		// 1) Thread obj=new Thread(this); 2)Thread obj=new Thread(this,str);
		obj=new Thread(this,str);
		// The advantage of passing string str in Thread class constructor is,  
		// Thread.currentThread().getName() will return string str
		// When obj.start() executes, then It will call run method.
	
		
		obj.start();
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(500);
				//System.out.println("HI");
				System.out.println(Thread.currentThread().getName()+" Running");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		
	}

}
