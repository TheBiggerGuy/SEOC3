package uk.ac.ed.inf.seoc.seoc3.plant.internal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Hashtable;

import org.apache.log4j.Logger;

public class FactoryStore {
	
	private static final FactoryStore singletonFactoryStore = new FactoryStore();
	
	private static Hashtable<Integer, PlantFactory> factories;
	private static Logger log;
	
	private FactoryStore(){
		log = Logger.getLogger(FactoryStore.class);
		
		factories = new Hashtable<Integer, PlantFactory>(10);
	}
	
	public static FactoryStore getFactoryStore(){
		return singletonFactoryStore;	
	}
	
	public static FactoryStore getFactoryStore(File CSVFile) throws Exception {
		CSVImporter(CSVFile);
		return singletonFactoryStore;	
	}
	
	protected int numberOfFactories() {
		return factories.size();
	}
	
	protected PlantFactory getFactoryFor(PlantProduct product) throws Exception {
		
		for(PlantFactory factory: getAllFactories()){
			if(factory.doesProduce(product))
				return factory;
		}
		
		// TODO: 
		throw new Exception("TODO");
		
	}
	
	protected PlantFactory[] getAllFactories() {
		PlantFactory[] bill = new PlantFactory[factories.size()];
		return factories.values().toArray(bill);
	}
	
	private static void CSVImporter(File plantLocationFile) throws Exception {
		
		// Plant Locations
		// <Plant Code,Name,Address1,Address2,Address3,Address4,Postcode>
		
		BufferedReader bufRdr = new BufferedReader(new FileReader(plantLocationFile));
		
		String line = null;
		boolean isFirst = true;
		while( (line = bufRdr.readLine()) != null){
			
			if(isFirst){
				isFirst = false;
			} else {
			
				try{
				
					String[] tokens = line.split(",");
					int id = Integer.parseInt(tokens[0]);
					String name = tokens[1];
					String[] address = new String[5];
					address[0] = tokens[2];
					address[1] = tokens[3];
					address[2] = tokens[4];
					address[3] = tokens[5];
					address[4] = tokens[6];
					
					if(!factories.containsKey(id)){
						PlantLocation location = new PlantLocation(address, name);
						PlantFactory factory = new PlantFactory(id, name, location);
						factories.put(id, factory);
						
						log.debug("Add factory ("+name+")");
						
					}
				
				} catch (Exception e) {
					log.error("Failed to add factory");
				}
			}
		}
		
	}

}
