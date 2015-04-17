import java.util.Scanner;
public class MAD {
	
	public static void mad(double[]actual, double[]forecast ) {
		double N = actual.length;
		double sigma = 0;
		double deviations = Math.abs(sigma);
		if (actual.length != forecast.length) 
			{throw new RuntimeException("Make sure that Actual and Forecast arrays are the same length!"); }
		else
		for(int i = 0; i < actual.length;i++) {
			
			double rawr = Math.abs(actual[i] - forecast[i]);
			System.out.println(rawr);
			sigma += rawr++;
		}
		System.out.print("Cumulative Forecast Error: " + sigma);
		System.out.print("MAD: " +sigma / N);
	}
	public static void main(String[] args) {
		//Calculates Mean Absolute Deviation
		double[] actual, forecast;
		System.out.println("MAD = Mean Absolute Deviation");
		System.out.println("Formula: The sume of |Actual - Forecast| / N");
		System.out.println("Subtract the Actual numbers from the Forecast \n Take the Absolute Value of that and divide by N");
		System.out.println("How does this work? Type in how many items you have \n Example, I have actual numbers from each month of a year, type in 12");
		System.out.println("Once you type 12, hit enter and list your 12 numbers.  Do the same process for the Forecasts.");
		actual = StdArrayIO.readDouble1D();
		forecast = StdArrayIO.readDouble1D();
		mad(actual, forecast);
	}

}
