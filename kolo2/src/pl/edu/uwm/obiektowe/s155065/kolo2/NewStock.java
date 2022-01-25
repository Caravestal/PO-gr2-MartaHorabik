package pl.edu.uwm.obiektowe.s155065.kolo2;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Stack;

public class NewStock extends Stock implements IListable {
    private LinkedList<StockPosition> positions = new LinkedList<>();

    @Override
    public double getTotalValue() {
        // uwzględniając discount
        double totalValue = 0;
        for (StockPosition _sp: this.positions) {
            totalValue += _sp.getValue();
        }
        return totalValue - (totalValue * this.getDiscount());

    }

    public void addPosition(StockPosition sp){
        this.positions.add(sp);
        this.addProduct(sp.getProduct());
    }

    @Override
    public Stack<Product> getSortedByValue(boolean ascending) {
        // implementacja sortowania po cenie produktu
        LinkedList<StockPosition> positionCopy = (LinkedList<StockPosition>)this.positions.clone();
        if(ascending){
            // pamietajmy, że stos będzie miał odwrócona kolejność jeżeli będziemy dodawać w
            // kolejności z LinkedList poprzez push() na stos
            Collections.sort(positionCopy, Comparator.reverseOrder());
        }
        else {
            Collections.sort(positionCopy);
        }
        // konwersja positionCopy na kolekcję typu Stack
        Stack<Product> stosPosortowany = new Stack<>();
        for (StockPosition sp: positionCopy) {
            stosPosortowany.push(sp.getProduct());
        }

//        return stosPosortowany;

        // właściwa implementacja przy użyciu własnego komparatora
        // do posortowania po wartości pozycji (tak jak w zadaniu z koła) należy napisać własny komparator
        LinkedList<StockPosition> positionCopy2 = (LinkedList<StockPosition>)this.positions.clone();
        StockPositionComparator customComparator = new StockPositionComparator();
        Collections.sort(positionCopy2, customComparator);
        // i kolejność odwrócona
        Collections.sort(positionCopy2, customComparator.reversed());

        Stack<Product> stosPosortowany2 = new Stack<>();
        for (StockPosition sp: positionCopy2) {
            stosPosortowany2.push(sp.getProduct());
        }

        return stosPosortowany2;
    }

    class StockPositionComparator implements Comparator<StockPosition> {

        @Override
        public int compare(StockPosition o1, StockPosition o2) {
            // porównujemy wartość (cena * ilość) dla danego produktu
            return Double.compare(o1.getValue(), o2.getValue());
        }

        @Override
        public Comparator<StockPosition> reversed() {
            return Comparator.super.reversed();
        }
    }
}