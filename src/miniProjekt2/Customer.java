package miniProjekt2;

class Customer {
	
//	SubClass
//	Egenskaper:
//	-Antal köpta varor				Kan ändras JA
//	-Totala summan av köpta varor	Kan ändras JA
	
//	Metoder:
//	Varje gång en vara köps ska antal varor och totala summan uppdateras
	
    private int prodAmount = 0;
    private double totalCost = 0;

    void addToCart(int prodAmount, double totalCost) {
        this.prodAmount += prodAmount;
        this.totalCost += totalCost;
    }

    int getProdAmount() {
        return this.prodAmount;
    }

    double getTotalCost() {
        return this.totalCost;
    }
	
}
