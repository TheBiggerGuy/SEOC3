/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.internal;

/**
 * @author guy
 *
 */
public class Product implements uk.ac.ed.inf.seoc.seoc3.external.Product {
	
	private int productID;
	private String name;
	private int orderQuantityModulo;
	
	private boolean isFragile;
	private boolean isChilled;
	private boolean isFrozen;
	private boolean isFlammable;
	
	
	/* All the Setters ***************************************************** */
	
	protected void setProductID(int id) {
		this.productID = id;
	}
	
	protected void setName(String name) {
		this.name = name;
	}
	
	protected void setOrderQuantityModulo(int orderQuantityModulo) {
		this.orderQuantityModulo = orderQuantityModulo;
	}
	
	protected void setIsFragile(Boolean isFragile) {
		this.isFragile = isFragile;
	}
	
	protected void setIsChilled(Boolean isChilled) {
		this.isChilled = isChilled;
	}
	
	protected void setIsFrozen(Boolean isFrozen) {
		this.isFrozen = isFrozen;
	}
	
	protected void setIsFlammable(Boolean isFlammable) {
		this.isFlammable = isFlammable;
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
	public int getOrderQuantityModulo() {
		return orderQuantityModulo;
	}

	@Override
	public boolean isFragile() {
		return isFragile;
	}

	@Override
	public boolean isChilled() {
		return isChilled;
	}

	@Override
	public boolean isFrozen() {
		return isFrozen;
	}

	@Override
	public boolean isFlammable() {
		return isFlammable;
	}

}
