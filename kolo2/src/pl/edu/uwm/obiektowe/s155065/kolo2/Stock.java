package pl.edu.uwm.obiektowe.s155065.kolo2;
import java.util.ArrayList;

public class Stock {
    private ArrayList<Product> products = new ArrayList<>();
    private float discount = 0.0f;

    public final boolean addProduct(Product p){
        // jeżeli produkt o takim id już jest to ignoruj dodanie
        for (Product _p: this.products) {
            if(_p.getId() == p.getId()) {
                return false;
            }
        }
        products.add(p);
        return true;
    }

    public void applyDiscount(float _discount){
        // dodanie sprawdzania czy łączny rabat nie przekracza 50%
        if(this.discount + _discount > 0.5){
            System.out.println("Łączna wartość rabatu nie może przekraczać 50%. Ten rabat nie zostanie naliczony");
            return;
        }
        this.discount += _discount;
    }

    public double getTotalValue(){
        double totalValue = 0;
        for (Product _p: this.products) {
            totalValue += _p.getPrice();
        }
        return totalValue - (totalValue * this.discount);
    }

    public float getDiscount() {
        return discount;
    }
}