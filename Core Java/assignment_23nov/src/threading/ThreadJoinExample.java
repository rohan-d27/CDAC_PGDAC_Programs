package threading;

public class ThreadJoinExample {

	public static void main(String[] args) throws InterruptedException {
		
		Thread hi = new Thread(new T1());
		hi.setPriority(Thread.MAX_PRIORITY);
		hi.setName("hi");
		
		Thread hello = new Thread(new T1());
		hello.setPriority(Thread.MIN_PRIORITY);
		hello.setName("hello");
		
		hi.start();
		hello.start();
		
		hi.join(); //calling thread waits till hi is not completed
		System.out.println("main ends ...goodbye...");
		
		
	}
	
}


class T1 implements Runnable
{
	@Override
	public void run() {
	   for(int i=0;i<10;i++) {
		   System.out.println("say "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
		   try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
		
	}
}