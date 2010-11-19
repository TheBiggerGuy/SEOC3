/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.external;

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

}
