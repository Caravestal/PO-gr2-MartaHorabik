package pl.edu.uwm.obiektowe.s155065.kolo2;

public class Main {

    public static void main(String[] args) {
		Stock stock = new Stock();

		Book book1 = new Book("Pan Tadeusz", 1, 39.99, "ISBN: 857-645","Adam Mickiewicz");
		Book book2 = new Book("Władca Pierścieni", 1, 49.99, "ISBN: 857-645","J.R.R. Tolkien");
		Book book3 = new Book("Steve Jobs", 1, 29.99, "ISBN: 857-645","Isaacson");

		stock.addProduct(book1);
		stock.addProduct(book2);
		stock.addProduct(book3);
		stock.getTotalValue();
		stock.applyDiscount(0.15f);
		stock.getTotalValue();
		stock.applyDiscount(0.4f);
		stock.getTotalValue();

		// testing stock position class

		StockPosition<Book, Integer> pos1 = new StockPosition<>(book1, 4);
		StockPosition<Book, Integer> pos2 = new StockPosition<>(book2, 2);
		StockPosition<Book, Integer> pos3 = new StockPosition<>(book3, 1);
		System.out.println(pos1.getValue());
		System.out.println(pos2.getClass().isInstance(pos1));
		System.out.println(pos1.equals(pos2));

		NewStock ns = new NewStock();
		ns.addPosition(pos1);
		ns.addPosition(pos2);
		ns.addPosition(pos3);
		ns.getTotalValue();
		ns.applyDiscount(0.1f);
		ns.getTotalValue();
		ns.getSortedByValue(true);
	}
}