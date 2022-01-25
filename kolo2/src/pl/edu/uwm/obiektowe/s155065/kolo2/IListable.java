package pl.edu.uwm.obiektowe.s155065.kolo2;
import java.util.Stack;

public interface IListable {

    Stack<Product> getSortedByValue(boolean ascending);
}