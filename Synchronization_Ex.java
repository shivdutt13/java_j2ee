package core.string.stringBuffer.stringBuilder;

import com.sun.corba.se.impl.orbutil.threadpool.ThreadPoolImpl;

/*
	1.	The word synchronization generally means sharing data between multiple processors or threads.
	2.	Only methods (or blocks) can be synchronized, Classes and variable cannot be.
	3.	Each object has just one lock.
	4.	A class can have both synchronized and non-synchronized methods.
	5.	If a thread goes to sleep, it holds any locks it has—it doesn't release them.
	6.	A thread can acquire more than one lock. For example, a thread can enter a synchronized method, 
		thus acquiring a lock, and then immediately invoke a synchronized method on a different object, 
		thus acquiring that lock as well. As the stack unwinds, locks are released again.
	7.	Constructors cannot be synchronized 
	8.	If any method is specified with the keyword synchronized then this method of an object is 
		only executed by one thread at a time.
	9.	Synchronized blocks place locks for shorter periods than synchronized methods.
*/
class MyThread extends Thread{
	Share s;
	MyThread(Share s,String str){
		super(str);
		this.s=s;
		start();
	}
	public void run(){
		s.doword(Thread.currentThread().getName());
	}
}

class Share{

/* ------------------------->    synchronized method()    <--------------*/	
	/*public synchronized void doword(String str){
//	9.	synchronized method -- code written in this method is accessed by only one thread at a time.
		for(int i=0;i<1;i++){
			System.out.println("Started   :"+str);
			try{
				Thread.sleep(100L);
//	10.	We made the thread to sleep for some time while other thread access the code. 				
			}catch(Exception e){}
		}
	}*/
/* ------------------------->    synchronized block {}   <--------------*/	
	public void doword(String str){
		synchronized(this){
// 10.	synchronized block having object of current class.			
			for(int i=0;i<1;i++){
				System.out.println("Started   :"+str);
				try{
					Thread.sleep(50);
				}catch(Exception e){}
			}
		}
	}
}

public class Synchronization_Ex {
	public static void main(String args[]){
		Share s=new Share();
		MyThread m1=new MyThread(s,"Thread1");
		MyThread m2=new MyThread(s,"Thread2");
		MyThread m3=new MyThread(s,"Thread3");
	}
	
}