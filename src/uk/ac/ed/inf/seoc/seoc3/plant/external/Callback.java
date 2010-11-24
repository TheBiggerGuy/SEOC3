/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.plant.external;

/**
 * @author s0700260
 *
 */
public interface Callback {
	
	public void statusChange(int uid, ProductionStates state);

}
