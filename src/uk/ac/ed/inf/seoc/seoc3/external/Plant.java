/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.external;

import java.util.Date;

/**
 * @author s0700260
 *
 */
public interface Plant {
	
	public int requestProduction(Product product, int quantity) throws RequestError;
	
	public Date requestProductionEstimate(Product product, int quantity) throws RequestError;
	
	public OrderStatus getStatus(int uid) throws RequestError;
	
	public boolean requestCancellation(int uid) throws RequestError;
	
	public Product[] getAllProducts();
	
	public Report getReport();
	
	public void registerStatusChangeCallback(Callback callback);

}
