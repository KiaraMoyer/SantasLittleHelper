/* 
 * Santa's Little Helper
 * This program will allow users to input the price of their two  toys and 
 * the program will output the subtotal, tax and total of both toys.
 *
 * Kiara Moyer
 * 12/04/2017
 * 
 */
 
 import java.util.*;
 import java.text.*;
 
 class Lab2Santa {
 	// Global Definitions
 	static String iFName, iLName, iToy1, iToy2, iData, iAge, oTotal, oSubtotal, oTax, oCost1, oCost2;
 	static double iCost1, iCost2, cTotal, cSubtotal, cTax, cDiscount;
 	static Scanner scanner;
 	static	Date	today;
 	static	SimpleDateFormat simpleDF;
 	static DecimalFormat dfDouble3v2;
 	
	
 	public static void main(String[] args) {
 		init();
 		input();
 		calcs();
 		output();
 	}
 	
 	public static void init() {
 		scanner = new Scanner(System.in);
 		scanner.useDelimiter("\r\n");
 		today=new Date();
 		simpleDF = new SimpleDateFormat("EEEE MMMM dd, yyyy");
 		dfDouble3v2 = new DecimalFormat("$####.00");
 	
 	}
 	
 	public static void input() {
 		System.out.println("Please enter first name.");
 		iFName = scanner.next();
 		System.out.println("Please enter last name.");
 		iLName = scanner.next();
 		System.out.println("Please enter age");
 		iAge = scanner.next();
 		System.out.println("Please enter the name of the first toy");
 		iToy1 = scanner.next();
 		System.out.println("Please enter cost of " + iToy1);
 		iData = scanner.next();
 		
 		try { iCost1 = Double.parseDouble(iData);
 		}
 		catch(Exception e) {
 			System.out.println("Invalid price entered. Automated price to 0.00");
 			iCost1 = 0;
 		}
 		
 		System.out.println("Please enter the name of the second toy");
 		iToy2 = scanner.next();
 		System.out.println("Please enter the cost of " + iToy2);
 		iData = scanner.next();
 		
 			try { iCost2 = Double.parseDouble(iData);
 		}
 		catch(Exception e) {
 			System.out.println("Invalid price entered. Automated price to 0.00");
 			iCost2 = 0;
 		}
 		
 	}
 	
 	public static void calcs() {
 		cSubtotal = iCost1 + iCost2;
 		cTax = cSubtotal * .07;
 		cDiscount = cSubtotal * .2;
 		cSubtotal = cSubtotal - cDiscount;
 		cTotal = cSubtotal + cTax;
 	
 	}
 	
 	public static void output() {
 		oCost1 = dfDouble3v2.format(iCost1);
 		oCost2 = dfDouble3v2.format(iCost2);
 		oSubtotal = dfDouble3v2.format(cSubtotal);
 		oTax = dfDouble3v2.format(cTax);
 		oTotal = dfDouble3v2.format(cTotal);
 		System.out.println(" ");
 		System.out.println("Date:" + simpleDF.format(today));
 		System.out.println("Name: " + iFName + " " + iLName);
 		System.out.println("Cost of " + iToy1 + ": " + oCost1);
 		System.out.println("Cost of " + iToy2 + ": " + oCost2);
 		System.out.println("Subtotal: " + oSubtotal);
 		System.out.println("Tax: " + oTax);
 		System.out.println("Total: " + oTotal);
 		System.out.println("Merry Christmas!");
 		System.out.println("End of program");
 	}
 }
 	
 	