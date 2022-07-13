package entities;

public class Student {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	public double average;
	public double missingPoint;
	
	public void calcAverage() {
		this.average = nota1 + nota2 + nota3;
	}
	
	public void calcMissingPoint(double average) {
		this.missingPoint = 60.00 - average;
	}
	
	public String situation() {
		calcAverage();
		if(average >= 60.00) {
			return "FINAL GRADE = "
				+ String.format("%.2f",average)
				+ "%nPASS";
		}else {
			calcMissingPoint(average);
			return "FINAL GRADE = "
				+ String.format("%.2f",average)
				+ "%nFAILED %nMISSING "
				+ String.format("%.2f",missingPoint)
				+ " POINTS";
		}
	}
	
}
