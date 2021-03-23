package com.xe.synchronizeddemo;

public class Test {

	public static void main(String[] args) {
        Test test = new Test();
//        test.test1();
//        test.test2();
//        test.test3();
//        test.test4();
        
	}
	
	/**
	 * 测试一个 修饰方法
	 */
	private void test4() {
		MyObject myObject = new MyObject();
		Thread myThreadA4 = new MyThreadA4("MyThreadA4", 3000,myObject);
		Thread myThreadB4 = new MyThreadB4("MyThreadB4", 500,myObject);
		Thread myThreadC4 = new MyThreadC4("MyThreadC4", 100,myObject);
		try {
			myThreadA4.start();
			Thread.sleep(100);
			myThreadB4.start();
			Thread.sleep(100);
			myThreadC4.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 测试一个 修饰静态方法
	 */
	private void test3() {
		MyObject myObject = new MyObject();
		Thread myThreadA3 = new MyThreadA3("MyThreadA3", 3000);
		Thread myThreadB3 = new MyThreadB3("MyThreadB3", 500,myObject);
		Thread myThreadC3 = new MyThreadC3("MyThreadC3", 100);
		try {
			myThreadA3.start();
			Thread.sleep(100);
			myThreadB3.start();
			Thread.sleep(100);
			myThreadC3.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 测试 修饰一个类
	 */
	private void test2() {
		MyObject myObject = new MyObject();
		MyObject myObject2 = new MyObject();
		MyThreadA2 myThreadA2 = new MyThreadA2("MyThreadA2", 3000, myObject);
		MyThreadB2 myThreadB2 = new MyThreadB2("MyThreadB2", 100, myObject2);
		try {
			myThreadA2.start();
			Thread.sleep(100);
			myThreadB2.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
    
	/**
	 * synchronized 同步语句块
	 */
	private void test1() {
		MyObject myObject = new MyObject();
		MyThreadA myThreadA = new MyThreadA("MyThreadA", 3000, myObject);
		MyThreadB myThreadB = new MyThreadB("MyThreadB", 500, myObject);
		try {
			myThreadA.start();
			Thread.sleep(100);
			myThreadB.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
