package com.xe.synchronizeddemo;

public class MyThreadC4 extends Thread{
	private long mSleepTime = 0;
	private MyObject myObject = null;
	public MyThreadC4(String name,long sleepTime,MyObject myObject) {
		super(name);
		this.mSleepTime = sleepTime;
		this.myObject = myObject;
	}
	
	@Override
	public void run() {
		super.run();
		if (myObject != null) {
			myObject.run8(mSleepTime);
		}
	}
}
