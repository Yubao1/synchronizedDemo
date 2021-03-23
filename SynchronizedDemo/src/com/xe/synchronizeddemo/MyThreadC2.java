package com.xe.synchronizeddemo;

public class MyThreadC2 extends Thread{
	private long mSleepTime = 0;
	private MyObject myObject = null;
	public MyThreadC2(String name,long sleepTime,MyObject myObject) {
		super(name);
		this.mSleepTime = sleepTime;
		this.myObject = myObject;
	}
	
	@Override
	public void run() {
		super.run();
		if (myObject != null) {
			myObject.run3(mSleepTime);
		}
	}
}
