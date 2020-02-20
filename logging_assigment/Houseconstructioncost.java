package logging_assigment;

import java.util.Scanner;
import java.util.logging.Logger;


public class Houseconstructioncost {
	private static  final Logger LOGGER=Logger.getLogger(Simpleandcompoundinterest.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		LOGGER.info("MATERIAL STANDARD IS IN RANGE FROM (1-4)");
		LOGGER.info("Choose the value of material standard:");
		int materialstandard=in.nextInt();
		LOGGER.info("TOTAL AREA IS IN SQUARE FEETS");
		LOGGER.info("Enter total area in square feets:");
		int totalarea=in.nextInt();
		LOGGER.info("THE HOUSE IS AUTOMATED IF HOUSE IS OF ABOVE HIGH STANDARDS CAN BE DENOTED BY 1");
		LOGGER.info("THE HOUSE IS NOT AUTOMATED IF IT IS NOT ABOVE HIGH STANDARDS CAN BE DENOTED BY 0");
		LOGGER.info("Choose the house type either 1 or 0:");
		int isautomated=in.nextInt();
		Houseconstruction house=new Houseconstruction(materialstandard,totalarea,isautomated);
		long totalcost=(long)house.costofhouse();
		LOGGER.info("\n");
		LOGGER.info("TOTAL COST FOR HOUSE CONSTRUCTION: Rs."+totalcost);
		in.close();
	}

}
