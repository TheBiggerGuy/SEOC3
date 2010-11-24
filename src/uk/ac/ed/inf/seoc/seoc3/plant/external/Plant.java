/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.plant.external;

import java.util.Date;

/**
 * @author s0700260 (Guy Taylor)
 * @version 0.3
 *
 */
public interface Plant {

	/**
	 * @param product
	 *            The ID of the product to produce
	 * @param quantity
	 *            The quantity of the product to produce. The given number x
	 *            {@link Product#getProductionQuantityModulo()}
	 * @return The ID to an OrderStatus
	 * @throws RequestError
	 *             This will happen if the product does not exist
	 */
	public int requestProduction(Product product, int quantity)
			throws RequestError;

	/**
	 * Will estimate a date and time that the give product can be produced in
	 * the given quantity.<br />
	 * This estimate is a one of, thus if the same information is used I a
	 * subsequent {@link Plant#requestProduction(Product, int)} there is no
	 * guarantee it will be equal.
	 * 
	 * @param product
	 *            The ID of the product to produce
	 * @param quantity
	 *            The quantity of the product to produce. The given number x
	 *            {@link Product#getProductionQuantityModulo()}
	 * @return The estimated Date and Time that this could be produced on.
	 * @throws RequestError
	 *             This will happen if the product does not exist
	 */
	public Date requestProductionEstimate(Product product, int quantity)
			throws RequestError;

	/**
	 * @param orderStatusID
	 * @return
	 * @throws RequestError
	 */
	public OrderStatus getStatus(int orderStatusID) throws RequestError;

	/**
	 * @param orderStatusID
	 * @return
	 * @throws RequestError
	 */
	public boolean requestCancellation(int orderStatusID) throws RequestError;

	/**
	 * @return
	 */
	public Product[] getAllProducts();

	/**
	 * @return
	 */
	public Report getReport();

	/**
	 * @param callback
	 */
	public void registerStatusChangeCallback(Callback callback);

}
