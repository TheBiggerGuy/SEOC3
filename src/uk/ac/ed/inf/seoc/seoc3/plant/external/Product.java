/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.plant.external;

/**
 * @author s0700260 (Guy Taylor)
 * @version 0.4
 *
 */
public interface Product {
	
	/** A unique int that will constatntly represent this product */
	public int getProductID();
	
	/**
	    The name of the product (This may not be unique) 
	    @return @see java.lang.String   The name
	*/
	public String getName();
	
	/** The quantity of products that an order must be divisable by and also above */
	public int getProductionQuantityModulo();
	
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
