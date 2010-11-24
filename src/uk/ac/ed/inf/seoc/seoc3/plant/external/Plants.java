/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.plant.external;

import java.util.Date;

/**
 * @author s0700260 (Guy Taylor)
 * @version 0.9
 * 
 */
public interface Plants {

	/**
	 * @param product
	 *            The ID of the product to produce
	 * @param quantity
	 *            The quantity of the product to produce. The given number x
	 *            {@link Product#getProductionQuantityModulo()}
	 * @return The ID to an OrderStatus
	 * @throws RequestError
	 *             If the product does not exist
	 */
	/**
	 * @param product
	 * @param quantity
	 * @return
	 * @throws RequestError
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
	 *             If the product does not exist
	 */
	public Date estimateProductionTime(Product product, int quantity)
			throws RequestError;

	/**
	 * Will return the Status of a production
	 * 
	 * @param productionID
	 * @return {@link ProductionStatus} for the given ID
	 * @throws RequestError
	 *             If the production does not exist
	 */
	public ProductionStatus getStatus(int productionID) throws RequestError;

	/**
	 * Attempt to cancel a production.
	 * 
	 * @param productionID
	 * @return True if the production was successfully cancelled, False
	 *         otherwise.
	 * @throws RequestError
	 *             If the production does not exist
	 */
	public boolean requestCancellation(int productionID) throws RequestError;

	/**
	 * Get a list of all the products that can be produced
	 * 
	 * @return A list of all {@link Product}
	 */
	public Product[] getAllProducts();

	/**
	 * Generate a report of all the factories and productions
	 * 
	 * @return
	 */
	public Report getReport();

	/**
	 * Add a callback function so other classes can be interrupted on new data.
	 * 
	 * @param callback
	 *            The interface to call
	 */
	public void registerCallback(Callback callback);

}
