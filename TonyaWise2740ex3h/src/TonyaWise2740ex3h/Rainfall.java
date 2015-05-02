package TonyaWise2740ex3h;

public class Rainfall {
//p479
	private double [] rainfallArray;
	
	public Rainfall(double[] rainfall) {
		rainfallArray = new double[rainfall.length];
		
		for (int index = 0; index < rainfall.length; index++)
			rainfallArray[index] = rainfall[index];
	}
	public Rainfall(String[] rainfall) {
		rainfallArray = new double[rainfall.length];
		
		for (int index = 0; index < rainfall.length; index++)
			rainfallArray[index] = Double.parseDouble(rainfall[index]);
	}
	
	public double getTotal() {
		double total = 0.0;
		
		for (double value : rainfallArray)
			total += value;
		
		return total;
	}
	
	public double getAverage() {
		return getTotal() / this.rainfallArray.length;
	}
	
	public double getHighest() {
		double highest = rainfallArray[0];
		
		for (int index = 1; index < rainfallArray.length; index++)
		{
			if (rainfallArray[index] > highest)
				highest = rainfallArray[index];
		}
		return highest;
	}
	
	public double getLowest() {
		double lowest = rainfallArray[0];
		
		for (int index = 1; index < rainfallArray.length; index++)
		{
			if (rainfallArray[index] < lowest)
				lowest = rainfallArray[index];
		}
		return lowest;
	}
}
