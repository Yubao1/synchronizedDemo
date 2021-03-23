package com.xe.synchronizeddemo;

public class MyThreadA3 extends Thread{
	private long mSleepTime = 0;
	public MyThreadA3(String name,long sleepTime) {
		super(name);
		this.mSleepTime = sleepTime;
	}
	
	@Override
	public void run() {
		super.run();
		MyObject.run5(mSleepTime);
	}
}
