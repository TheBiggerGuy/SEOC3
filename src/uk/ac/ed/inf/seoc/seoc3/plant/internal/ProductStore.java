package uk.ac.ed.inf.seoc.seoc3.plant.internal;

import java.util.Hashtable;

import uk.ac.ed.inf.seoc.seoc3.plant.internal.PlantProduct;

public class ProductStore {

	private Hashtable<Integer, PlantProduct> products;
	private int productIDcounter = 99;
	
	public ProductStore() {
		products = new Hashtable<Integer, PlantProduct>(200);
	}
	
	protected int addProduct(String name) throws Exception{

		productIDcounter ++;
		PlantProduct newProduct = new PlantProduct(productIDcounter, name);		
		products.put(productIDcounter, newProduct);
		
		return productIDcounter;
		
	}
	
	protected int numberOfProducts() {
		return products.size();
	}
	
	protected void removeProduct(int id) throws ProductNotFoundException{
		try{
			getProduct(id);	// check to see if there is a product to remove
		} catch (NullPointerException e) {
			throw new ProductNotFoundException();
		}
		
		products.remove(id);
	}
	
	protected PlantProduct getProduct(int id) throws ProductNotFoundException {
		PlantProduct productGot = products.get(id);
		
		if(productGot == null)
			throw new ProductNotFoundException();
		
		return productGot;
	}
	
	protected PlantProduct updateProduct(PlantProduct product) throws Exception {
		throw new Exception("TODO"); // TODO: implment
	}
	
	protected PlantProduct[] getAllProducts() {
 		PlantProduct[] bill = new PlantProduct[products.size()];
		return products.values().toArray(bill);
	}

}
