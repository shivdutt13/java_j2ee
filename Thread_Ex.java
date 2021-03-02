package core.string.stringBuffer.stringBuilder;

/*
	1.	DAEMON THREADS are threads with low priority and runs in the back ground doing the garbage collection 
		operation for the java runtime system. The setDaemon() method is used to create a daemon thread. 
		These threads run without the intervention of the user. 

	2.	We need to extend the ThreadPoolImpl class to create the ThreadPool, and call it's constructor with super 
		having parameter as minSize,maxSize,timeOut,threadPoolName.
		
		class Share extends ThreadPoolImpl{
			public Share(int minSize, int maxSize, long timeout, String threadpoolName) {
				super(minSize, maxSize, timeout, threadpoolName);
			}
		}
		
	3.	SLEEP() vs WAIT() :
		The sleep method is used when the thread has to be put aside for a fixed amount of time. 
		Ex: sleep(1000), puts the thread aside for exactly one second. 
		The wait method is used to put the thread aside for up to the specified time. It could wait for much lesser 
		time if it receives a notify() or notifyAll() call. Ex: wait(1000), causes a wait of up to one second. 
		The method wait() is defined in the Object and the method sleep() is defined in the class Thread.
		
	4.	PREEMPTIVE SCHEDULING 	vs TIMESLICING:
	 	Under preemptive scheduling the highest priority task executes until it enters the waiting or dead states 
	 	or a higher priority task comes into existence. 
	 	Under time slicing, a task executes for a predefined slice of time and then re-enters the pool of ready 
	 	tasks. The scheduler then determines which task should execute next, based on priority and other factors.
	 	
	 5. YIELDING AND SLEEPING:
	 	When a task invokes its yield() method, it returns to the ready state, either from waiting, running 
	 	or after its creation. When a task invokes its sleep() method, it returns to the waiting state from 
	 	a running state.
	 	
	 6.	THREAD STATES:
	 	a.) New: When thread instance created. at this stage thread is not alive.
	 	b.) Runnable: Eligible to run, but not selected by the scheduler. When start() is called new thread is alive.
	 	c.) Running: When run() is executed.
	 	d.) wait()/sleep()/block(): Eligible to run again.
	 	e.) dead: When it completes its run() code. no longer alive.
	 	
	 7.	YIELD() vs JOIN():
	 	yield() is supposed to do is to make the currently running thread head back to runnable to allow other
	 	thread of the same priority to get their turn.
	 	join() guranteed to cause thread to stop executing untill the thread it joins with completes. 
 */

class BasicThread1 extends Thread {
    // This method is called when the thread runs
    public void run() {
    	System.out.println("Thread is executed using Thread class.");
    }
}

class BasicThread2 implements Runnable {
    // This method is called when the thread runs
    public void run() {
    	System.out.println("Thread is executed using Runnable interface.");
    }
}


public class Thread_Ex {
	
	public static void main(String ar[]){
		// Create and start the thread
		Thread thread = new BasicThread1();
		thread.start();
		
		// Create the object with the run() method
		Runnable runnable = new BasicThread2();

		// Create the thread supplying it with the runnable object
		Thread thread1 = new Thread(runnable);
		thread1.start();
	}

}
