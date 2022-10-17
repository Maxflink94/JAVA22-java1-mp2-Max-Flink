package miniProjekt2;

class Product {

//	SuperClass
//	Egenskaper:
//	-Namn på varan
//	-Pris på varan
//	-Antal kvar (saldo)
	
//	Metoder:
//	Uppdatera saldot för varan varje gång en vara köps
	
	private String prodName;
	private int prodCost;
	private int prodRemain;
	
	Product (String prodName, int prodCost, int prodRemain){
		this.prodName = prodName;
		this.prodCost = prodCost;
		this.prodRemain = prodRemain;
	}
	
	int removeFromStock() {
		prodRemain--;
		return prodRemain;
	}
	
	public String getProdName() {
		return prodName;
	}

	public int getProdCost() {
		return prodCost;
	}

	public int getProdRemain() {
		if(prodRemain <= 0) {
			prodRemain = 0;
		}
		return prodRemain;
	}

	public void setProdRemain(int prodRemain) {
		this.prodRemain = prodRemain;
	}
}
