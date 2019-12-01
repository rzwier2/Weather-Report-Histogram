/*
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * Object-Oriented Programming: Project 3
 * @date 10/27/2019
 * @author Ryan Z
 +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
*/

import java.io.File;
import java.util.*;

public class WeatherReport {
	
	ArrayList<Double> rainFall = new ArrayList<Double>();
	
	public WeatherReport() { 
		File data = new File("CSI203_F19 Project_03_data.txt");
	
			
		try {
			Scanner in = new Scanner(data);
			while(in.hasNextDouble())
			{
					rainFall.add(in.nextDouble());
			}
			in.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// method to get the average for a particular month
	public double getAverage(int x)
	{
		int month = x;
		int monthCount = 0;
		double average = 0;
		for (int i = month; i < rainFall.size(); i+=13)
		{
			average = average + rainFall.get(i);
			++monthCount;
		}
		average = average / monthCount;
		return average;
	}
	
	// method to get the final year monthly average rainfall
	public double getLast(int x)
	{
		double value = 0;
		int month = x;
		int i = rainFall.size() - 13; 
		
		value = rainFall.get(i + month);
		
		return value;
	}
	
	// method to get the last year
	public double getYear()
	{
		int i = rainFall.size() - 13;
		double year = rainFall.get(i);
		return year;
	}
		
		
}	


