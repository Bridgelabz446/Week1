package fellowship;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Temprature should be in Fahrenheit");        
		double t = Double.parseDouble(args[0]);  
		System.out.println("wind speed in miles per hour");
		double v = Double.parseDouble(args[1]);
		
		double vpower=Math.pow(v, 0.16);
		double w=0.0;
		
		if(v<120&&v>3&&t<50)
		{
			 w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * vpower;
		}
		else 
			System.out.println("invalid ");
		
		        System.out.println("Temperature = " + t);
		        System.out.println("Wind speed  = " + v);
		        System.out.println("Wind chill  = " + w);
	}

}
