package uk.ac.ed.inf.seoc.seoc3.plant.internal;

import java.util.LinkedList;
import java.util.Queue;

import org.apache.log4j.Logger;

public class PlantFactory implements Runnable {
	
	PlantLocation location;
	String name;
	int id;
	Logger log;
	
	Thread thread;
	
	Queue<Production> productionQueue = new LinkedList<Production>();
	
	protected PlantFactory(int ID, String name, PlantLocation location){
		this.id = ID;
		this.location = location;
		this.name = name;
		
		this.log = Logger.getLogger(PlantFactory.class);
		
		thread = new Thread(this);
		thread.start();
	}
	
	protected boolean doesProduce(PlantProduct product){
		// TODO:
		return false;
	}

	@Override
	public void run() {
		Thread thisThread = Thread.currentThread();

		while(thisThread == thread){
			
			log.debug("Factory "+id+" is checking queue");
			
			Production head = productionQueue.peek();
			
			if(head != null && head.isFinished())
				productionQueue.poll();
			
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

}
