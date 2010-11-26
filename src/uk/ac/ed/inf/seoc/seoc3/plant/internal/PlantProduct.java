/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.plant.internal;

import java.util.ArrayList;

import uk.ac.ed.inf.seoc.seoc3.plant.interfaces.ProductProperties;

/**
 * @author guy
 * 
 */
public class PlantProduct implements uk.ac.ed.inf.seoc.seoc3.plant.interfaces.Product {

	private int productID;
	private String name;
	private int productionQuantityMultiplier;
	private ArrayList<ProductProperties> properties;

	protected PlantProduct(int productId, String name) {
		this.productID = productId;
		this.name = name;
		this.productionQuantityMultiplier = 1;
		this.properties = new ArrayList<ProductProperties>();
	}

	/* All the Setters ***************************************************** */

	protected void setProductID(int id) {
		this.productID = id;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected void setOrderQuantityModulo(int productionQuantityMultiplier) {
		this.productionQuantityMultiplier = productionQuantityMultiplier;
	}

	/* All the Getters ***************************************************** */

	@Override
	public int getProductID() {
		return productID;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getProductionQuantityMultiplier() {
		return productionQuantityMultiplier;
	}

	@Override
	public ProductProperties[] getProperties() {
		return (ProductProperties[]) properties.toArray();
	}

}
