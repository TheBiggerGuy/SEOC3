/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.plant.internal;

import java.util.Date;

import uk.ac.ed.inf.seoc.seoc3.plant.external.Callback;
import uk.ac.ed.inf.seoc.seoc3.plant.external.Product;
import uk.ac.ed.inf.seoc.seoc3.plant.external.ProductionStatus;
import uk.ac.ed.inf.seoc.seoc3.plant.external.Report;
import uk.ac.ed.inf.seoc.seoc3.plant.external.RequestError;

/**
 * @author s0700260
 *
 */
public class Plant implements Runnable,
		uk.ac.ed.inf.seoc.seoc3.plant.external.Plant {

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
	 * @see uk.ac.ed.inf.seoc.seoc3.plant.external.Plant#registerStatusChangeCallback(uk.ac.ed.inf.seoc.seoc3.plant.external.Callback)
	 */
	@Override
	public void registerStatusChangeCallback(Callback callback) {
		// TODO Auto-generated method stub

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

	/* (non-Javadoc)
	 * @see uk.ac.ed.inf.seoc.seoc3.plant.external.Plant#requestProductionEstimate(uk.ac.ed.inf.seoc.seoc3.plant.external.Product, int)
	 */
	@Override
	public Date requestProductionEstimate(Product product, int quantity)
			throws RequestError {
		// TODO Auto-generated method stub
		return null;
	}

}
