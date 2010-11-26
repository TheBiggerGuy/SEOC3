/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.plant.interfaces;

/**
 * @author s0700260 (Guy Taylor)
 * @version 0.5
 *
 */
public interface Product {
	
	/** A unique int that will constatntly represent this product (SKU) */
	public int getProductID();
	
	/**
	    The name of the product (This may not be unique) 
	    @return @see java.lang.String   The name
	*/
	public String getName();
	
	/** The quantity of a single production unit */
	public int getProductionQuantityMultiplier();
	
	/**
	    A list of additional properties<br />
	    such as:<br/>
	    <ul>
	        <li>Fragile</li>
	        <li>Chilled</li>
	        <li>Frozen</li>
	        <li>Flammable</li>
	    </ul>
	    @see ProductProperties
	*/
    public ProductProperties[] getProperties();
}
