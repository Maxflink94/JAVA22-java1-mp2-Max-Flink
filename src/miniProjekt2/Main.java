package miniProjekt2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Customer c = new Customer();

		Product p = new Product ("Gurka", 30, 4);
		Product p2 = new Product ("Lök", 20, 2);
		DiscProd dp = new DiscProd("Tomat", 15, 5, 0.5);
		
		boolean running = true;
		
		while(running) {
			
			System.out.println("1. Köp " + p.getProdName() + ", " + p.getProdCost() + " SEK, " + p.getProdRemain() + "st kvar");
			System.out.println("2. Köp " + p2.getProdName() + ", " + p2.getProdCost() + " SEK, " + p2.getProdRemain() + "st kvar");
			System.out.println("3. Köp " + dp.getProdName() + ", " + dp.discountedCost() + " SEK, " + dp.getProdRemain() + "st kvar");
			System.out.println("4. Avsluta och betala!");
			
			System.out.print("Välj en produkt: ");
			int customerPick = sc.nextInt();
	
				switch(customerPick) {
			
					case 1:
						if (p.getProdRemain() > 0) {
							c.addToCart(1, p.getProdCost());
						}
						else {
							System.out.println("Varan är tyärr slut, välj en annan eller avluta");
						}
						p.removeFromStock();
						break;
					case 2:
						if (p2.getProdRemain() > 0) {
							c.addToCart(1, p2.getProdCost());
						}
						else {
							System.out.println("Varan är tyärr slut, välj en annan eller avluta");
						}
						p2.removeFromStock();
						break;
					case 3:
						if (dp.getProdRemain() > 0) {
							c.addToCart(1, dp.discountedCost());
						}
						else {
							System.out.println("Varan är tyärr slut, välj en annan eller avluta och betala!");
						}
						dp.removeFromStock();
						break;
					case 4:
						running = false;
						System.out.println("Ni har köpt totalt " + c.getProdAmount() + " st varor. Den totala kostnaden blev " + c.getTotalCost() + "SEK");		
				}
				System.out.println();
		}
		sc.close();
	}

}
