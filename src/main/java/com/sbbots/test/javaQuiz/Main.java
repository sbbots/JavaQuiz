package com.sbbots.test.javaQuiz;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		// Car car = new Car(200, "Manual");
		// System.out.println(String.format("%d%s", car.maxSpeed, car.country));

		// Pet myPet = new Cat();
		// Cat johnsCat = new Cat();
		// Ball ball = new Ball();
		//
		// System.out.println(String.format("My %s is playing with a %s . John's
		// %s is sleeping", myPet.getName(), ball.getName(),
		// johnsCat.getName()));

		// Thread counter = new Thread(new Runnable() {
		//
		// public void run(){
		// for(int i=0; i<3; i++) {
		// System.out.println(i);
		// }
		// }
		// });
		// counter.start();

		// Parent object = new Child();
		// object.publicMethod();

		// Set<Integer> set = new TreeSet<Integer>();
		// set.add(3);
		// set.add((int)3.0);
		// set.add(2);
		// set.add(2);
		// set.add(new Integer(2));
		// set.add(Integer.parseInt("2"));
		// System.out.println(set);

//		String weather = "rainy";
//		changeTheString(weather);
//		System.out.println("The weather is " + weather);
//		String[] rainyDays = new String[] { "Monday", "Friday" };
//		changeTheArray(rainyDays);
//		System.out.println("The rainy days are " + rainyDays[0] + rainyDays[1]);
//		Forecast forecast = new Forecast();
//			forecast.pressure = 700;
//			forecast.temprature= 20;
//			changeTheObject(forecast);
//			System.out.println("The temprature is " + forecast.temprature);
			
//		List<Integer> list = new ArrayList<Integer>();
//		for(int i=0; i<5; i++) {
//			list.add(i/2);
//		}
//		System.out.println(list);
		
//		try {
//			
//			throw new FileNotFoundException();
//		} catch (FileNotFoundException e) {
//			System.out.println("file not found");
//		} catch(Exception e) {
//			System.out.println("exception");
//		}finally{
//			System.out.println("finally");
//		}
//		int i=0;
//		if(1 == i++) {
//			System.out.println("true");
//		} else{
//			System.out.println("false");
//		}
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		
//		List<Integer> tempList = new ArrayList<Integer>();
//		
//		for(Integer ele : a) {
//			if(ele %2 == 0) {
//				tempList.add(ele);	
//			}
//		}
//		a.removeAll(tempList);
//		System.out.println(a);
		
		Iterator<Integer> it = a.iterator();
		
		while(it.hasNext()) {
			Integer ele = it.next();
			if(ele %2 ==0) {
				it.remove();
			}
		}
		
		
		System.out.println(a);
		
	}

//	public static void changeTheArray(String[] rainyDays) {
//		rainyDays[1] = "Sunday";
//	}
//	public static void changeTheObject(Forecast forecast) {
//		forecast.temprature = 35;
//	}
//
//	public static void changeTheString(String weather) {
//		weather = "sunny";
//	}
	




	
		 
	
}
