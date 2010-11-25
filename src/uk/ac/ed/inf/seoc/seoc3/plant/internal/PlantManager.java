/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.plant.internal;

import java.io.File;
import java.util.Date;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import uk.ac.ed.inf.seoc.seoc3.plant.external.Callback;
import uk.ac.ed.inf.seoc.seoc3.plant.external.Product;
import uk.ac.ed.inf.seoc.seoc3.plant.external.ProductionStatus;
import uk.ac.ed.inf.seoc.seoc3.plant.external.Report;
import uk.ac.ed.inf.seoc.seoc3.plant.external.RequestError;

/**
 * @author s0700260
 *
 */
public class PlantManager implements Runnable,
		uk.ac.ed.inf.seoc.seoc3.plant.external.Plants {
	
	Logger log;
	ProductStore products;
	
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

	}
	
	public static PlantManager getPlantManager(){
		return singletonPlantManager;
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

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see uk.ac.ed.inf.seoc.seoc3.plant.external.Plant#getAllProducts()
	 */
	@Override
	public Product[] getAllProducts() {
		return (Product[]) products.getAllProducts();
	}

	/* (non-Javadoc)
	 * @see uk.ac.ed.inf.seoc.seoc3.plant.external.Plant#getReport()
	 */
	@Override
	public Report getReport() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see uk.ac.ed.inf.seoc.seoc3.plant.external.Plant#getStatus(int)
	 */
	@Override
	public ProductionStatus getStatus(int productionID) throws RequestError {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see uk.ac.ed.inf.seoc.seoc3.plant.external.Plant#requestCancellation(int)
	 */
	@Override
	public boolean requestCancellation(int productionID) throws RequestError {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see uk.ac.ed.inf.seoc.seoc3.plant.external.Plant#requestProduction(uk.ac.ed.inf.seoc.seoc3.plant.external.Product, int)
	 */
	@Override
	public int requestProduction(Product product, int quantity)
			throws RequestError {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public Date estimateProductionTime(Product product, int quantity)
			throws RequestError {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerCallback(Callback callback) {
		// TODO Auto-generated method stub
		
	}

}
