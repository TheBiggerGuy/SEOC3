package uk.ac.ed.inf.seoc.seoc3.internal;

import java.util.Hashtable;

import uk.ac.ed.inf.seoc.seoc3.internal.Product;

public class ProductStore {
	
	private int productCounter = 100;
	
	private Hashtable<Integer, Product> products = new Hashtable<Integer, Product>();
	
	public void addProduct(String name){
		
		Product newProduct = new Product();
		newProduct.setName(name);
		newProduct.setProductID(productCounter);
		
		this.products.put(productCounter, newProduct);
		
		productCounter ++;
		
	}
	
	public void removeProduct(int id){
		this.products.remove(id);
	}

}
