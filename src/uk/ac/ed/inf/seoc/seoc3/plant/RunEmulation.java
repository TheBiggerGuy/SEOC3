/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.plant;

import uk.ac.ed.inf.seoc.seoc3.plant.external.Product;
import uk.ac.ed.inf.seoc.seoc3.plant.internal.Plant;
import org.apache.log4j.*;

/**
 * @author s0700260
 *
 */
public class RunEmulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Logger log = Logger.getLogger(RunEmulation.class);
		
		// Set up a simple configuration that logs on the console.
	    BasicConfigurator.configure();
		
	    log.debug("RunEmulation Starting ... ");
		
	    Plant plant = new Plant();
		
		Thread plantThread = new Thread(plant);
		plantThread.run();
		
		log.debug("Plant.java Running ... ");
		
		// Get a list of all products
		log.debug("Get a list of all products:");
		Product[] products = plant.getAllProducts();
		for(Product product: products){
			log.debug("Product: "+product.getName());
		}

	}

}
