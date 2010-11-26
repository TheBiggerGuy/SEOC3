/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.plant.internal;

import uk.ac.ed.inf.seoc.seoc3.plant.interfaces.Location;

/**
 * @author s0700260
 *
 */
public class PlantLocation implements Location {
	
	String[] address;
	String name;

	/**
	 * 
	 */
	public PlantLocation(String[] address, String name) {
		this.address = address;
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see uk.ac.ed.inf.seoc.seoc3.plant.external.Location#getAddress()
	 */
	@Override
	public String[] getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see uk.ac.ed.inf.seoc.seoc3.plant.external.Location#getCommonName()
	 */
	@Override
	public String getCommonName() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see uk.ac.ed.inf.seoc.seoc3.plant.external.Location#getContactTel()
	 */
	@Override
	public String getContactTel() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see uk.ac.ed.inf.seoc.seoc3.plant.external.Location#getLatitude()
	 */
	@Override
	public Float getLatitude() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see uk.ac.ed.inf.seoc.seoc3.plant.external.Location#getLongitude()
	 */
	@Override
	public Float getLongitude() {
		// TODO Auto-generated method stub
		return null;
	}

}
