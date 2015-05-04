package com.sappsoftwaresolutions;

import com.sappsoftwaresolutions.flyweight.FlyweightFactory;


public class Main {

	public static void main(String[] args){
		for (int i=1;i<=100;i++){
			FlyweightFactory.getInstance().getPrintObj(i).print(i);
		}
	}
}
