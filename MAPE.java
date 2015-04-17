
public class MAPE {
	
	public static void mse(double[]actual, double[]forecast ) {
		double N = actual.length;
		double sigma = 0;

		if (actual.length != forecast.length) 
			{throw new RuntimeException("Make sure that Actual and Forecast arrays are the same length!"); }
		else
		for(int i = 0; i < actual.length;i++) {
			
			double difference = Math.abs(actual[i] - forecast[i]);
			double forecastError = difference / actual[i];
			double absPercentError = forecastError * 100;
			// Trace the input!
			System.out.println(actual[i] + " subtracted from " + forecast[i] + " yields an absolute value of: " + Math.abs(difference));
			System.out.println(difference + " divided by " + actual[i] + " yields " + forecastError);
			System.out.println(forecastError + " times 100 yields " + absPercentError);
			sigma += absPercentError;
		}
		System.out.print(sigma / N);
	}
	public static void main(String[] args) {
		//Calculates Mean Absolute Deviation
		double[] actual, forecast;
		System.out.println(" MAPE = Mean Absolute Percent Error");
		System.out.println(" Formula: 100(|Error/Actual|) / N");
		System.out.println(" Subtract the Actual from the Forecast \n Square it\n Divide by N-1");
		actual = StdArrayIO.readDouble1D();
		forecast = StdArrayIO.readDouble1D();
		
		System.out.print("Mean Actual Percent Error of these two arrays is\n ");
		mse(actual, forecast);
	}

}
