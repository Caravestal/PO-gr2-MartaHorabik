package pl.edu.uwm.obiektowe.s155065.kolo2;

public class StockPosition<T extends Product, V extends Number> implements Comparable<StockPosition> {

    private T product;
    private V quantity;

    public StockPosition(T product, V quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getValue(){
        return this.product.getPrice() * this.quantity.doubleValue();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !obj.getClass().isInstance(this)){
            return false;
        }
        else {
            StockPosition p = (StockPosition) obj;
            return p.product.getId() == this.product.getId();
        }
    }

    @Override
    public int compareTo(StockPosition o) {
        return Double.compare(this.product.getPrice(), o.product.getPrice());
    }

    public T getProduct() {
        return product;
    }
}