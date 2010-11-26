/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.plant.internal;

import java.util.Date;

import uk.ac.ed.inf.seoc.seoc3.plant.interfaces.Location;
import uk.ac.ed.inf.seoc.seoc3.plant.interfaces.Plants;
import uk.ac.ed.inf.seoc.seoc3.plant.interfaces.Product;
import uk.ac.ed.inf.seoc.seoc3.plant.interfaces.ProductionStates;
import uk.ac.ed.inf.seoc.seoc3.plant.interfaces.ProductionStatus;

/**
 * @author s0700260
 *
 */
public class PlantProduction implements ProductionStatus {
	
	int productID;
	int quantity;
	long timeToExspire;
	
	protected PlantProduction(int productID, int quantity){
		this.productID = productID;
		this.quantity = quantity;
		this.timeToExspire = System.currentTimeMillis() + 2*60*1000;
	}
	
	protected Boolean isFinished(){
		if(System.currentTimeMillis() > timeToExspire ){
			return true;
		} else {
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see uk.ac.ed.inf.seoc.seoc3.plant.interfaces.ProductionStatus#getCurrentEstimate()
	 */
	@Override
	public Date getCurrentEstimate() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see uk.ac.ed.inf.seoc.seoc3.plant.interfaces.ProductionStatus#getID()
	 */
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see uk.ac.ed.inf.seoc.seoc3.plant.interfaces.ProductionStatus#getLocation()
	 */
	@Override
	public Location getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see uk.ac.ed.inf.seoc.seoc3.plant.interfaces.ProductionStatus#getProduct()
	 */
	@Override
	public Product getProduct() {
		try {
			return ProductStore.getProductStore().getProduct(productID);
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see uk.ac.ed.inf.seoc.seoc3.plant.interfaces.ProductionStatus#getQuantity()
	 */
	@Override
	public int getQuantity() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see uk.ac.ed.inf.seoc.seoc3.plant.interfaces.ProductionStatus#getStatus()
	 */
	@Override
	public ProductionStates getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

}
