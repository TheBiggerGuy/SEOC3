/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.external;

/**
 * @author s0700260
 *
 */
public interface Product {
	
	public int getProductID();
	
	public String getName();
	
	public int getOrderQuantityModulo();

	public boolean isFragile();
	public boolean isChilled();
	public boolean isFrozen();
	public boolean isFlammable();

}
