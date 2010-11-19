/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.external;

/**
 * @author s0700260
 *
 */
public interface Location {
	
	public int getLongitude();
	public int getLatitude();
	
	public String getCommonName();
	
	public String[] getAddress();
	
	public String getContactTel();

}
