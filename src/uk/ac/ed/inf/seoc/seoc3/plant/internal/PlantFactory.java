package uk.ac.ed.inf.seoc.seoc3.plant.internal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import org.apache.log4j.Logger;

public class PlantFactory implements Runnable {
	
	PlantLocation location;
	String name;
	int id;
	Logger log;
	
	Thread thread;
	
	ArrayList<Integer> producables = new ArrayList<Integer>(5);
	
	Queue<PlantProduction> productionQueue = new LinkedList<PlantProduction>();
	
	protected PlantFactory(int ID, String name, PlantLocation location){
		this.id = ID;
		this.location = location;
		this.name = name;
		
		this.log = Logger.getLogger(PlantFactory.class);
		
		thread = new Thread(this);
		thread.start();
	}
	
	protected void addProduct(int productID){
		producables.add(productID);
	}
	
	protected boolean doesProduce(int productID){
		return producables.contains(productID);
	}

	@Override
	public void run() {
		Thread thisThread = Thread.currentThread();

		while(thisThread == thread){
			
			log.debug("Factory "+id+" is checking queue");
			
			PlantProduction head = productionQueue.peek();
			
			if(head != null && head.isFinished()){
				PlantProduction bob = productionQueue.poll();
				log.debug("Factory "+id+" has finnided making "+bob.getProduct().getName());
			}
			try {
				Thread.sleep( 60 * 1000 );
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	protected void stop(){
		thread = null;
	}

	public void addProduction(PlantProduction production) {
		productionQueue.add(production);		
	}

}
