/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.external;

/**
 * @author s0700260
 *
 */
public interface Product {
	
	/** A unique int that will constatntly represent this product */
	public int getProductID();
	
	/** The name of the product (This may not be unique) */
	public String getName();
	
	/** The quantity of products that an order must be divisable by and also above */
	public int getOrderQuantityModulo();
	
	/**
	    A list of aditinal properties<br />
	    such as:<br/>
	    <ul>
	        <li>Fragile</li>
	        <li>Chilled</li>
	        <li>Frozen</li>
	        <li>Flammable</li>
	    </ul>
	*/
    public ArrayList<String> getProperties()
}
