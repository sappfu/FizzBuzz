package com.sappsoftwaresolutions.factory;

import com.sappsoftwaresolutions.print.PrintBuzz;
import com.sappsoftwaresolutions.print.PrintFizz;
import com.sappsoftwaresolutions.print.PrintFizzBuzz;
import com.sappsoftwaresolutions.print.PrintInt;
import com.sappsoftwaresolutions.print.PrintInterface;

public class PrintFactory {
	private static PrintFactory factory;
	
	public static PrintFactory getFactory(){
		if (factory == null){
			factory = new PrintFactory();
		}
		return factory;
	}
	
	public PrintInterface makePrintInterfaceObject(int index){
		PrintInterface printer = null;
		if (index % 3 == 0 && index % 5 == 0){
			printer = new PrintFizzBuzz();
		}
		else if(index % 3 == 0){
			printer = new PrintFizz();
		}
		else if(index % 5 == 0){
			printer = new PrintBuzz();
		}
		else{
			printer = new PrintInt();
		}
		return printer;
	}
}
