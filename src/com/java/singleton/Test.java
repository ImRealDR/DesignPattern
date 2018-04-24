package com.java.singleton;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		 	int num=100;
	        final CyclicBarrier cyclicBarrier = new CyclicBarrier(num);
	        final Set<String> set=Collections.synchronizedSet(new HashSet<String>());
	        ExecutorService executorService = Executors.newCachedThreadPool();
	        for(int i=0;i<num;i++){
	            executorService.execute(new Runnable() {
	                public void run() {
	                    try {
	                        cyclicBarrier.await();//�����ȴ������̴߳�����ϣ�Ȼ��ͬʱִ�л�ȡʵ���Ĳ���
	                        Singleton3 singleton = Singleton3.getInstance();
	                        set.add(singleton.toString());
	                    } catch (Exception e) {
	                        e.printStackTrace();
	                    }
	                }
	            });
	        }
	        Thread.sleep(2000);
	        System.out.println("------�������������ȡ����ʵ��------");
	        for (String instance : set) {
	            System.out.println(instance);
	        }
	        executorService.shutdown();
	}
}
