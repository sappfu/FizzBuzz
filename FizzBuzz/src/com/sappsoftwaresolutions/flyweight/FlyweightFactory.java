package com.sappsoftwaresolutions.flyweight;

import java.util.Hashtable;

import com.sappsoftwaresolutions.factory.PrintFactory;
import com.sappsoftwaresolutions.print.PrintInterface;

public class FlyweightFactory {
	private static FlyweightFactory factory;
	private Hashtable<String, PrintInterface> list;
	
	public FlyweightFactory(){
		list = new Hashtable<String,PrintInterface>();
	}
	
	public static FlyweightFactory getInstance(){
		if (factory == null){
			factory = new FlyweightFactory();
		}
		return factory;
	}
	
	public PrintInterface getPrintObj(int index){
		PrintInterface printer = (PrintInterface)list.get(""+index);
		if (printer == null){
			printer = PrintFactory.getFactory().makePrintInterfaceObject(index);
			list.put(""+index,printer);
		}
		return printer;
	}
}
