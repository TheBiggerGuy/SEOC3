/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.external;

/**
 * @author s0700260
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
