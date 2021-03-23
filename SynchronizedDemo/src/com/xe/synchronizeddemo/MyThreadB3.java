package com.xe.synchronizeddemo;

public class MyThreadB3 extends Thread{
	private long mSleepTime = 0;
	private MyObject myObject = null;
	public MyThreadB3(String name,long sleepTime,MyObject myObject) {
		super(name);
		this.mSleepTime = sleepTime;
		this.myObject = myObject;
	}
	
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		super.run();
		if (myObject != null) {
			myObject.run5(mSleepTime);
		}
	}
}
