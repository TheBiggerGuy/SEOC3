package uk.ac.ed.inf.seoc.seoc3.internal;

import java.util.Hashtable;

import uk.ac.ed.inf.seoc.seoc3.internal.Product;

public class ProductStore {
	
	private int productCounter = 100;
	
	private Hashtable<Integer, Product> products = new Hashtable<Integer, Product>();
	
	protected void addProduct(String name){
		
		Product newProduct = new Product();
		newProduct.setName(name);
		newProduct.setProductID(productCounter);
		
		this.products.put(productCounter, newProduct);
		
		productCounter ++;
		
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
