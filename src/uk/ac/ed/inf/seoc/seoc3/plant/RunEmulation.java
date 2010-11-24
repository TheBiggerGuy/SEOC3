/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.plant;

import uk.ac.ed.inf.seoc.seoc3.plant.internal.Plant;

/**
 * @author s0700260
 *
 */
public class RunEmulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Runnable plant = new Plant();
		
		Thread plantThread = new Thread(plant);
		plantThread.run();

	}

}
