package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		// Expressão lambida, Predicate
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		/* FORMAS DE EXPRESSÂO LAMBIDAS COM FUNÇÕES:
		
		// list.removeIf(p -> p.getPrice() >= 100);  Predicado em forma de expressão lambida
		// list.removeIf(new ProductPredicate());  // interface funcional em expressão lambida, sem o método referencial.
		// list.removeIf(Product :: staticProductPredicate); // método referencial (::) estatico em expressão lambida.
		// list.removeIf(Product :: staticProductPredicate); // método referencial(::)  não estatico em expressão lambida. 
		/* Predicate<Product> pred = p -> p.getPrice() >= 100.00; // expressão lambida declarada
		   list.removeIf(pred); */
		
		   double min = 100.00; 
		   list.removeIf(p -> p.getPrice() >= min);// expressão lambida inline não declarada
		
		for (Product lista: list) {
			System.out.println(lista);
		}
    }
	
	/* SAÍDA
	  
	  Mouse ,50.0
      HD Case ,80.9 
	 */
}
