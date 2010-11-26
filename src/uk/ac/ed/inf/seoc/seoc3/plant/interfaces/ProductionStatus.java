/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.plant.interfaces;

import java.util.Date;

/**
 * @author s0700260 (Guy Taylor)
 * @version 0.3
 *
 */
public interface ProductionStatus {
	
	public int getID();
	
	public Product getProduct();
	
	public int getQuantity();
	
	public ProductionStates getStatus();
	
	public Location getLocation();
	
	public Date getCurrentEstimate();

}
