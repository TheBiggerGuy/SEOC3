/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.plant.external;

/**
 * @author s0700260 (Guy Taylor)
 * @version 0.1
 */
public interface Location {
	
	/**
	    The Longitude of the location + for East and - for West<br />
	    Set to NaN for unknown/inappropriate
	*/	
	public Float getLongitude();
	
	/**
	    The Latitude of the location + for North and - for South<br />
	    Set to NaN for unknown/inappropriate
	*/	
	public Float getLatitude();
	
	/** Human readable sort name ie "Edinburgh Factory South" */
	public String getCommonName();
	
	/** The seperated parts of a standered postal address including postcode */
	public String[] getAddress();
	
	/** A single point of contact telephone number */
	public String getContactTel();

}
