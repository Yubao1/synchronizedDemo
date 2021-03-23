package com.xe.synchronizeddemo;

public class MyThreadA extends Thread {
	private long mSleepTime = 0;
	private MyObject myObject = null;
	public MyThreadA(String name,long sleepTime,MyObject myObject) {
		super(name);
		this.mSleepTime = sleepTime;
		this.myObject = myObject;
	}
	
	@Override
	public void run() {
		super.run();
		if (myObject != null) {
			myObject.run(mSleepTime);
		}
	}
}
