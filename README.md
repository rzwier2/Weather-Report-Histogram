# Weather-Report-Histogram

This project will familiarize you with try-catch constructs in Java and graphics programming using JavaFX. The given task was to write a program in Java to display histograms (bar graphs). The program reads monthly rainfall data for multiple years from a file, computes the monthly average rainfall for all those years, and displays a histogram of the monthly averages over all the years, alongside the histogram for the last year of recorded rainfall. 

The input file will have for each year, one line of thirteen numbers.  The first number will be an integer representing the year; the remaining 12 numbers will be floating point numbers representing that year’s monthly rainfall in millimeters. For example a line could be 1998  20.0  22.0  17.0  14.0  5.0  0.0  0.0  0.0  7.0  12.0  30.0  20.0. There will be a minimum of 5 lines (representing 5 years’ data) in the file, but you must not take for granted that there will be exactly that many: the program is designed to read as many lines as there are, and maintains a running count. Also, the program catches an EOFException at the end of the file and stop reading input. 

The program contains a class call WeatherReport and a driver program called TestWeatherReport.  The former contains the method to read data from the file and store them in an array appropriately. It is used for calculating the averages. The tasks, to be handled with respect to drawing the parts of the charts are as follows:
		- The axes. The x-axis is to be labeled with the months of the year, and the Y axis will be labeled at 0, 10, 20 etc.  The axes     				themselves are to be lines. 
		- The axis labels. Use an array of 3-letter strings for the names of the months on the x-axis. You need only print the numbers 0, 10, 			20 etc. on the y-axis but printing the months is good.
		- The bars. Each bar represents the average rainfall for that month (and, the actual rainfall for the particular year in question). 				Use green and red (or any two different colors of your own creation) 2D rectangles to draw the pairs of bars.  Only one (the final) 			year’s data is to be shown along with the average data for all the years.
		- The title. Write the title in the middle of the graph. 
		- The frame’s title should be “Rainfall Graph – YYYY” where YYYY is the year being displayed.
