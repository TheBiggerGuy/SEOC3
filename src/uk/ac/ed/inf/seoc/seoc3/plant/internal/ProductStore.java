package uk.ac.ed.inf.seoc.seoc3.plant.internal;

import java.util.Hashtable;

import uk.ac.ed.inf.seoc.seoc3.plant.internal.PlantProduct;

public class ProductStore {
	
	private int productCounter = 99;
	
	private Hashtable<Integer, PlantProduct> products = new Hashtable<Integer, PlantProduct>();
	
	protected int addProduct(String name) throws Exception{
		
		if(products.containsValue(name))
			throw new Exception("Product already in store with the same name");
		
		productCounter ++;
		
		PlantProduct newProduct = new PlantProduct(productCounter, name);		
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
	
	protected PlantProduct getProduct(int id) throws ProductNotFoundException {
		try{
			return this.products.get(id);
		} catch (NullPointerException e) {
			throw new ProductNotFoundException();
		}
	}
	
	protected PlantProduct updateProduct(int id) throws Exception {
		throw new Exception("TODO"); // TODO: implment
	}
	
	protected PlantProduct[] getAllProducts() {
		return (PlantProduct[]) products.values().toArray();
	}

}
