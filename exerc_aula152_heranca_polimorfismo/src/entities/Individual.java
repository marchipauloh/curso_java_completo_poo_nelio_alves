package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;
	
	public Individual () {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		if(super.getanualIncome() < 20000.00) {
			if(healthExpenditures > 0) {
				return (getanualIncome() * 0.15) - (healthExpenditures / 2); 
			} else {
				return getanualIncome() * 0.15; 
			}
		} else {
			if(healthExpenditures > 0) {
				return (getanualIncome() * 0.25) - (healthExpenditures / 2); 
			} else {
				return getanualIncome() * 0.25; 
			}
		}		 
	}
}
