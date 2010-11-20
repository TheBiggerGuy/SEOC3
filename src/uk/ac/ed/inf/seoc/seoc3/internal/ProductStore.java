package uk.ac.ed.inf.seoc.seoc3.internal;

import java.util.Hashtable;

import uk.ac.ed.inf.seoc.seoc3.external.ProductNotFoundException;
import uk.ac.ed.inf.seoc.seoc3.internal.Product;

public class ProductStore {
	
	private int productCounter = 99;
	
	private Hashtable<Integer, Product> products = new Hashtable<Integer, Product>();
	
	protected int addProduct(String name) throws Exception{
		
		if(products.containsValue(name))
			throw new Exception("Product already in store with the same name");
		
		productCounter ++;
		
		Product newProduct = new Product(productCounter, name);		
		this.products.put(productCounter, newProduct);
		
		return productCounter;
		
	}
	
	protected int numberOfProducts() {
		return products.size();
	}
	
	protected void removeProduct(int id) throws ProductNotFoundException{
		try{
			this.products.remove(id);
		} catch (NullPointerException e) {
			throw new ProductNotFoundException();
		}
	}
	
	protected Product getProduct(int id) throws ProductNotFoundException {
		try{
			return this.products.get(id);
		} catch (NullPointerException e) {
			throw new ProductNotFoundException();
		}
	}
	
	protected Product updateProduct(int id) throws Exception {
		throw new Exception("TODO"); // TODO: implment
	}
	

}
