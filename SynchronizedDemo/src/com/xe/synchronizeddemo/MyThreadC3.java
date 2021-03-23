package com.xe.synchronizeddemo;

public class MyThreadC3 extends Thread{
	private long mSleepTime = 0;
	public MyThreadC3(String name,long sleepTime) {
		super(name);
		this.mSleepTime = sleepTime;
	}
	
	@Override
	public void run() {
		super.run();
		MyObject.run6(mSleepTime);
	}
}
