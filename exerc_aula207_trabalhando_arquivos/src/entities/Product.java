package entities;

public class Product {
	
	private String name;
	private Double price;
	private Integer qtde;
	
	public Product() {
	}
	
	public Product(String name, Double price, Integer qtde) {
		this.name = name;
		this.price = price;
		this.qtde = qtde;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQtde() {
		return qtde;
	}

	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}
	
	public Double calTotalValue() {
		return price * qtde;
	}
	
	@Override
	public String toString() {
		return name + ',' + String.format("%.2f", calTotalValue());
				
	}
	

}
