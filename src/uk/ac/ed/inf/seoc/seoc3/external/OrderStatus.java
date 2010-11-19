/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.external;

import java.util.Date;

/**
 * @author s0700260
 *
 */
public interface OrderStatus {
	
	public int getUID();
	
	public Product getProduct();
	
	public int getQuantity();
	
	public ProductionStates getStatus();
	
	public Location getLocation();
	
	public Date getProductionEstimate();

}
