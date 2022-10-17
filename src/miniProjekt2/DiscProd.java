package miniProjekt2;

class DiscProd extends Product {

//	SubClass till Product
//	Egenskaper:
//	-Namn på varan
//	-Pris på varan
//	-Antal kvar (saldo)
//	-Rabatterade priset
	
//	Metoder:
//	-Uppdatera saldot för varan varje gång en vara köps
//	-Returnera de nya rabatterade priset i menyn för Produkten
	
	private double discount;
	
	DiscProd(String prodName, int prodCost, int prodRemain, double discount) {
		super(prodName, prodCost, prodRemain);
		this.discount = discount;
	}
	
	double discountedCost() {
		double discProdCost = (int) (getProdCost()-(discount*getProdCost()));
		return discProdCost;
	}

	public double getDiscount() {
		return discount;
	}
}
