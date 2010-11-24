/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.plant.external;

import java.util.Date;

/**
 * @author s0700260
 *
 */
public interface Plant {
	
	/**
	 * @param product		The ID of the product to produce
	 * @param quantity		The quantity of the product to produce
	 * @return				The ID to an OrderStatus
	 * @throws RequestError
	 */
	public int requestProduction(Product product, int quantity) throws RequestError;
	
	/**
	 * @param product		The ID of the product to produce
	 * @param quantity		The quantity of the product to produce
	 * @return				The estimated Date and Time that this could be produced on.
	 * @throws RequestError
	 */
	public Date requestProductionEstimate(Product product, int quantity) throws RequestError;
	
	public OrderStatus getStatus(int uid) throws RequestError;
	
	public boolean requestCancellation(int uid) throws RequestError;
	
	public Product[] getAllProducts();
	
	public Report getReport();
	
	public void registerStatusChangeCallback(Callback callback);

}
