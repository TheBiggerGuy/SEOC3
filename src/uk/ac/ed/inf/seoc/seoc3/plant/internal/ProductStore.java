package uk.ac.ed.inf.seoc.seoc3.plant.internal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Hashtable;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import uk.ac.ed.inf.seoc.seoc3.plant.internal.PlantProduct;

public class ProductStore {

	private static final ProductStore singletonProductStore = new ProductStore();
	
	private static Hashtable<Integer, PlantProduct> products;
	private static Logger log;
	
	private ProductStore(){
		log = Logger.getLogger(ProductStore.class);
		BasicConfigurator.configure();
		
		products = new Hashtable<Integer, PlantProduct>(200);
	}
	
	public static ProductStore getProductStore(){
		return singletonProductStore;	
	}
	
	public static ProductStore getProductStore(File CSVFile) throws Exception {
		CSVImporter(CSVFile);
		return singletonProductStore;	
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
	
	protected PlantProduct[] getAllProducts() {
 		PlantProduct[] bill = new PlantProduct[products.size()];
		return products.values().toArray(bill);
	}
	
	private static void CSVImporter(File plantLocationFile) throws Exception {
		
		// Plant Locations
		// <Plant Code,Name,Address1,Address2,Address3,Address4,Postcode>
		
		BufferedReader bufRdr = new BufferedReader(new FileReader(plantLocationFile));
		
		String line = null;
		while( (line = bufRdr.readLine()) != null){
			
			try{
			
				String[] tokens = line.split(",");
				int id = Integer.parseInt(tokens[0]);
				String name = tokens[1];
				
				if(!products.containsKey(id)){
					PlantProduct product = new PlantProduct(id, name);
					products.put(id, product);
				}
			
			} catch (Exception e) {
				log.error("Failed to add product");
			}
		}
		
	}

}
