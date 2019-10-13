package DataStructure;

public class Calender {
		
		public static void main(String[] args) {
			int month=Integer.parseInt(args[0]);
			int year=Integer.parseInt(args[1]);
			
			System.out.println(month);
			System.out.println(year);
			
			
			int daysMonth=0;
			String monthDisplay=" ";
			int day=toFindDay(1, month, year); 
			
			//printCalendar(daysMonth,day);
			switch(month)
	        {
	            case 1:  monthDisplay = "January";
	                daysMonth = 31;
	                printCalendar(daysMonth,day);
	                
	                break;

	            case 2: 
	                monthDisplay = "February";
	                int leapYear = 0;
	                while (leapYear > -1)
	                {   
	                    // Count all years that are divisible by 4 to be a leap year.
	                    leapYear += 4;

	                    // If the year inputted is a leap year, the days of the month will be 29.
	                    if (year == leapYear)
	                    {
	                        daysMonth = 29;
	                        printCalendar(daysMonth,day);
	                        
	                        break;
	                    }

	                    else 
	                    {
	                        daysMonth = 28;
	                        printCalendar(daysMonth,day);
	                        break;
	                    }
	                }
	                break;

	            case 3: monthDisplay = "March";
	                daysMonth = 31;
	                printCalendar(daysMonth,day);
	                
	                break;

	            case 4: monthDisplay = "April";
	                daysMonth = 30;
	                printCalendar(daysMonth,day);
	                
	                break; 

	            case 5: monthDisplay = "May";
	                daysMonth = 31;
	                printCalendar(daysMonth,day);
	                
	                break;

	            case 6: monthDisplay = "June";
	                daysMonth = 30;
	                printCalendar(daysMonth,day);
	                
	                break; 

	            case 7: monthDisplay = "July";
	                daysMonth = 31;
	                printCalendar(daysMonth,day);
	                
	                break;

	            case 8: monthDisplay = "August";
	                daysMonth = 31;
	                printCalendar(daysMonth,day);
	                
	                break;

	            case 9: monthDisplay = "September";
	                daysMonth = 30;
	                printCalendar(daysMonth,day);
	                
	                break;

	            case 10: monthDisplay = "October";
	                daysMonth = 31;
	                printCalendar(daysMonth,day);
	                
	                break;

	            case 11: monthDisplay = "November";
	                daysMonth = 30;
	                printCalendar(daysMonth,day);
	                
	                break;

	            case 12: monthDisplay = "December";
	                daysMonth = 31;
	                printCalendar(daysMonth,day);
	                
	                break; 

	            // If the month is not recognized, dialog box will be displayed, and then exits program. 
	            default : System.out.print("Invalid: Your month is not recognized. ");
	               break;
	                
	              
	               
	        }
			
			
			
		}
		
		public static void printCalendar(int month,int days)
		{    
			
			
			
			
			int arr[][]=new int[6][7];
			String day[]={"sunday"  , "monday" ,  "tuesday"  , "wedne" ,  "thrus" ,  "friday"  , "saturday"};

	         for(int i=0;i<day.length;i++)
	         {     
	        	 System.out.print("   "+day[i]);
	         }
			System.out.println();
			int value=1;
			
			for(int i=0;i<6;i++)
			{
				for(int j=days;j<7;j++)
				{       
					if(value>month)
					 {
						 break;
					 }
					
						arr[i][j]=value;
						value++;
			}
				
				days=0;
			}
			for(int i=0;i<6;i++)
			{
				
				for(int j=0;j<7;j++)
				{
					        
					if (arr[i][j] == 0 ) {
						System.out.print("\t ");
					} else if (arr[i][j] > 0) {
						System.out.print( "\t" +arr[i][j]+"  ");
					}    
							
				    	   
				       
					  
				}
				System.out.println();
			}
			
			
		}
		
		
		
		
		public static int toFindDay(int d, int m, int y) {
			int y0= y -(14 -m ) / 12;
			int x = y0 +(y0 /4)-(y0 /100) + (y0/400);
			
			
			int m0= m + 12 *((14 -m )/12)-2;
			
			int d0 = ( (d +x +31 *m0/12)) % 7;
			return d0;
			
		}
}
