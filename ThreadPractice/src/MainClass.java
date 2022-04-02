
public class MainClass {

	public static void main(String[] args) {
		/*
		 * Perform Single task from Single thread ( one run() method and one thread (t1))
		 * Perform Single task from Multiple thread ( one run() method and multiple thread (t1,t2,t3))
		 * Perform Multiple task from Single thread (Not Possible as at a time one thread can perform one task)
		 * Perform Multiple task from Multiple thread ( multiple run() method , create multiple class
		 * and create single run method in each class)
		 */
		
		/*
		 * Here we have implemented Single task from Single thread  ( by creating obj1 only )and 
		 * Perform Single task from Multiple thread ( by creating both obj1 and obj2)
		 * both obj1 and obj2 are calling same run(), i.e same task
		 */
		
		SingleTaskMultipleThread obj1=new SingleTaskMultipleThread("1st Thtread");
		SingleTaskMultipleThread obj2=new SingleTaskMultipleThread("2nd Thtread");
		
		
		// Thread Life cycle
		
		/*
		 * MainClass t1=new MainClass();
		   t1.start();
		   MainClass t2=new MainClass();
		   t2.start();
		   t1.start(); It will give error as once the thread is dead , It can't be regenerated again.
		 * 
		 */

	}
/*
 * 	@Override
	public void run() {
	System.out.println("HI");
		
	} 
 */

	
}
