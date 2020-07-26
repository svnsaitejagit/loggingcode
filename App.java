package com.epam.mavanlogging;

//package com.epam.Construction_Logging_task;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
try {
        	
        	
	        
	        Scanner input=new Scanner(System.in);
	        
	        LOGGER.debug("Material Standards \t\t cost in INR/feet");
	        LOGGER.debug("-----------------------------------------------");
	        LOGGER.debug("1.Normal Standard \t\t\t 1200");
	        LOGGER.debug("2.Above Standard \t\t\t 1500");
	        LOGGER.debug("3.High Standard \t\t\t 1800");
	        LOGGER.debug("4.High & Automated Standard \t\t 2500\n");
	        LOGGER.debug("press Y if you want Fully Automated Home & press N if you dont't");
	        char c=input.next().charAt(0);
	        int material_standard=0;
	        if(c=='Y' || c=='y')
	        {
	        	 material_standard=2500;
	        }
	        else
	        {
	        	 LOGGER.debug("Enter respective number for required Standard from above mentioned options");
	        
	        
	        int client_choice=input.nextInt();
	        switch(client_choice)
	        {
	            case(1):
	                {
	                     material_standard=1200;
	                     break;
	                }
	             case(2):
	                {
	                     material_standard=1500;
	                     break;
	                }
	             case(3):
	                {
	                     material_standard=1800;
	                     break;
	                }
	             case(4):
	                {
	                     material_standard=2500;
	                     break;
	                }
	                default:
	                	 LOGGER.debug("You have choosen Invalid choice");
	                 System.exit(0);
	        }
	        }
	        LOGGER.debug("Enter your house Area");
	        int total_area_of_house=input.nextInt();
	        int total_estimated_cost_of_house=material_standard*total_area_of_house;
	        LOGGER.debug("\nEstimated cost of your house is "+total_estimated_cost_of_house);
	        input.close();
	        
	}
	catch(Exception e)
	{
		 LOGGER.debug("Enter valid details");
	    System.exit(0);
	}
    }
}