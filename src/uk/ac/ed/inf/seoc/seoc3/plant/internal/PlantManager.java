/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.plant.internal;

import java.io.File;
import java.util.Date;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import uk.ac.ed.inf.seoc.seoc3.plant.interfaces.Callback;
import uk.ac.ed.inf.seoc.seoc3.plant.interfaces.Product;
import uk.ac.ed.inf.seoc.seoc3.plant.interfaces.ProductionStatus;
import uk.ac.ed.inf.seoc.seoc3.plant.interfaces.Report;
import uk.ac.ed.inf.seoc.seoc3.plant.interfaces.RequestError;

/**
 * @author s0700260
 *
 */
public class PlantManager implements uk.ac.ed.inf.seoc.seoc3.plant.interfaces.Plants {
	
	Logger log;
	ProductStore products;
	FactoryStore factories;
	
	private static final String FILE_ROOT = "/afs/inf.ed.ac.uk/user/s07/s0700260/3rdYear/seoc/eclipse/SEOC3/res/";
	
	private static final PlantManager singletonPlantManager = new PlantManager();
	
	private PlantManager(){
		
		log = Logger.getLogger(PlantManager.class);
		BasicConfigurator.configure();
		log.debug("Plants Contructor");
		
		try {
			products = ProductStore.getProductStore( new File(FILE_ROOT+"SCLS_ProductSpecification.csv") );
		} catch (Exception e) {
			log.error("Could not import CSV file");
			products = ProductStore.getProductStore();
		}
		
		try {
			factories = FactoryStore.getFactoryStore( new File(FILE_ROOT+"SCLS_PlantLocation.csv") );
		} catch (Exception e) {
			log.error("Could not import CSV file");
			factories = FactoryStore.getFactoryStore();
		}
		
		try{
			PlantFactory london = factories.getFactoryByID(811);
			london.addProduct( products.getProductIDFromName("Ariel"));
			london.addProduct( products.getProductIDFromName("Pampers"));
			london.addProduct( products.getProductIDFromName("Febreeze"));
			
			PlantFactory manchester = factories.getFactoryByID(812);
			manchester.addProduct( products.getProductIDFromName("Wella"));
			manchester.addProduct( products.getProductIDFromName("Clairol"));
			manchester.addProduct( products.getProductIDFromName("Head & Shoulders"));
			manchester.addProduct( products.getProductIDFromName("Pantene"));
			
			PlantFactory newcastle = factories.getFactoryByID(813);
			newcastle.addProduct( products.getProductIDFromName("Olay"));
			newcastle.addProduct( products.getProductIDFromName("Crest"));
			newcastle.addProduct( products.getProductIDFromName("Vicks"));
			
			PlantFactory reading = factories.getFactoryByID(814);
			reading.addProduct( products.getProductIDFromName("Gillette Mach 3"));
			reading.addProduct( products.getProductIDFromName("Gillette Fusion"));
			reading.addProduct( products.getProductIDFromName("Duracell AA Batteries"));
			
			PlantFactory seaton = factories.getFactoryByID(815);
			seaton.addProduct( products.getProductIDFromName("Hugo Boss"));
			seaton.addProduct( products.getProductIDFromName("Ghost"));
			seaton.addProduct( products.getProductIDFromName("Lacoste"));
			seaton.addProduct( products.getProductIDFromName("Max Factor"));
		
		} catch (Exception e) {
			log.error("Could not hand code products to factories");
		}

	}
	
	public static PlantManager getPlantManager(){
		return singletonPlantManager;
	}

	@Override
	public Date estimateProductionTime(int productID, int quantity)
			throws RequestError {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product[] getAllProducts() {
		return (Product[]) products.getAllProducts();
	}

	@Override
	public Report getReport() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductionStatus getStatus(int productionID) throws RequestError {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerCallback(Callback callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean requestCancellation(int productionID) throws RequestError {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int requestProduction(int productID, int quantity)
			throws RequestError {
		
		if(quantity < 1)
			throw new RequestError();
		
		try{
			products.getProduct(productID);
		} catch (Exception e) {
			throw new RequestError();
		}
		
		PlantFactory factory;
		try {
			factory = factories.getFactoryFor(productID);
		} catch (Exception e) {
			throw new RequestError();
		}
		
		PlantProduction production = new PlantProduction(productID, quantity);
		
		factory.addProduction(production);
		
		return production.getID();
	}
	
	/*
	protected boolean addProduct(String name) {
		
		log.debug("Trying add product ("+name+")");
		
		try {
			products.addProduct(name);
			return true;
		} catch (Exception e) {
			log.error("addProduct Exception ("+e.getMessage()+")");
		}
		
		return false;
	}
	*/

}
