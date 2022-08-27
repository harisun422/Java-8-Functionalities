package versionEight;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

@FunctionalInterface
interface abc{
 void addition(int a, int b);	
}
public class TestMaventutorial implements Runnable{
	
	public void run() {
		System.out.println("calling run method");
		method1();
		System.out.println("calling run method");
	}
	
	public void method1() {
		int x=10;
		int y=20;
			System.out.println("thread id : "+Thread.currentThread().getId());
			abc nn = (a,b)-> System.out.println("the sum is "+(a+b));
			
	}
	
	@Test
	public void invoke() {
	int a=5;
	int b=8;
	System.out.println("invoked test method");
	System.out.println("Sum of "+a+" and "+b+" is "+Sum.add(a,b));
	Thread t= new Thread(new TestMaventutorial());
	t.start();
	
	HashMap<Integer,String> hm= new HashMap<Integer,String>();
	hm.put(1,"Hari");
	hm.put(2,"Jack");
	hm.put(11,"prasad");
	hm.put(12,"Krishna");
	hm.put(21,"Ramaaa");
	hm.put(22,"Lakshmana");
	

	//Iterator<Integer,String> i = hm.iterator();
	
	for(Entry<Integer,String> I  : hm.entrySet()){
	{
		System.out.println(I);
		
	}
	

	}
	}
}

