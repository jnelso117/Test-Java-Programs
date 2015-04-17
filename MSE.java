public class MSE {
	
	public static double mse(double[]actual, double[]forecast ) {
		double N = actual.length - 1;
		double sigma = 0;

		if (actual.length != forecast.length) 
			{throw new RuntimeException("Make sure that Actual and Forecast arrays are the same length!"); }
		else
		for(int i = 0; i < actual.length;i++) {
			
			double deviation = Math.abs(actual[i] - forecast[i]);
			// Trace the input!
			System.out.println(actual[i] + " subtracted from " + forecast[i] + " yields an absolute value of: " + Math.abs(deviation));
			System.out.println(deviation + " Squared yields " + Math.pow(deviation, 2));
			sigma += Math.pow(deviation,2);
		}
		return sigma / N;
	}
	public static void main(String[] args) {
		//Calculates Mean Absolute Deviation
		double[] actual, forecast;
		System.out.println(" MSE = Mean Squared Error");
		System.out.println(" Formula: The sume of (Actual - Forecast)^2 / N-1");
		System.out.println(" Subtract the Actual from the Forecast \n Square it\n Divide by N-1");
		actual = StdArrayIO.readDouble1D();
		forecast = StdArrayIO.readDouble1D();
		
		System.out.print("Mean Squared Error of these two arrays is " + mse(actual, forecast));
	}

}
