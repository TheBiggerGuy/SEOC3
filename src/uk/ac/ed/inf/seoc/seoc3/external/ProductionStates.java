/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.external;

/**
 * @author s0700260 (Guy Taylor)
 * @version 0.1
 *
 */
public enum ProductionStates {
	
	OrderRevived,
	
	OrderAccepted, OrderDenied,
	
	OrderInProductionQueue,
	OrderInProduction,
	
	OrderReadyForRemoval,
	
	OrderComplete, OrderCanceled;

}
