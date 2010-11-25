/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.plant.internal;

import java.util.Date;

import org.apache.log4j.Logger;

import uk.ac.ed.inf.seoc.seoc3.plant.RunEmulation;
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
	
	public PlantManager(){
		
		log = Logger.getLogger(RunEmulation.class);
		log.debug("Plants Contructor");
		
		products = new ProductStore();
		
		for(String product: new String[] {"Product 1", "Product 2", "Product 3", "Product 4"}){
			try {
				products.addProduct(product);
			} catch (Exception e) {
				log.error("Contructor Exception ("+e.getMessage()+")");
			}
		}
	}
	
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
		// TODO Auto-generated method stub
		return null;
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
