package com.xe.synchronizeddemo;

public class MyObject {
	
    public void run(long sleepTime) {
    	synchronized (this) {
			try {
				Thread.sleep(sleepTime);
				String threadName = Thread.currentThread().getName();
				String log = "当前线程为---" + threadName;
				System.out.println(log);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
    }
    
    public void run2(long sleepTime) {
    	synchronized (this) {
			try {
				Thread.sleep(sleepTime);
				String threadName = Thread.currentThread().getName();
				String log = "当前线程为---" + threadName;
				System.out.println(log);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
    }
    
    public void run3(long sleepTime) {
    	synchronized (MyObject.class) {
			try {
				Thread.sleep(sleepTime);
				String threadName = Thread.currentThread().getName();
				String log = "当前线程为---" + threadName;
				System.out.println(log);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
    }
    
    public void run4(long sleepTime) {
    	synchronized (MyObject.class) {
			try {
				Thread.sleep(sleepTime);
				String threadName = Thread.currentThread().getName();
				String log = "当前线程为---" + threadName;
				System.out.println(log);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
    }
    
    public synchronized static void run5(long sleepTime) {
    	runPlublic(sleepTime);
    }
    
    public synchronized static void run6(long sleepTime) {
    	runPlublic(sleepTime);
    }
    
    private static void runPlublic(long sleepTime) {
    	try {
			Thread.sleep(sleepTime);
			String threadName = Thread.currentThread().getName();
			String log = "当前线程为---" + threadName;
			System.out.println(log);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
    
    public synchronized void run7(long sleepTime) {
    	runPlublic(sleepTime);
    }
    
    public synchronized void run8(long sleepTime) {
    	runPlublic(sleepTime);
    }
}
