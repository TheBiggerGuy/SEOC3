/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.plant.interfaces;

/**
 * @author s0700260 (Guy Taylor)
 * @version 0.1
 *
 */
public enum ProductionStates {
	
	OrderReceived,
	
	OrderAccepted, OrderDenied,
	
	OrderInProductionQueue,
	OrderInProduction,
	
	OrderReadyForRemoval,
	
	OrderComplete, OrderCanceled;

}
