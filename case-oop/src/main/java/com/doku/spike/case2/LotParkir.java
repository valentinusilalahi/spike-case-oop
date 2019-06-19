package com.doku.spike.case2;


/**
 * Created by IntelliJ IDEA.
 * User: valentinussilalahi
 * Date: 2019-06-18
 * Time: 10:00
 * To change this template use File | Settings | File and Code Templates.
 */
public class LotParkir {
	private ParkirLevel[] levels;
	private final int NUM_LEVELS = 5;
	
	public LotParkir(){
		levels = new ParkirLevel[NUM_LEVELS];
		for (int i = 0; i < NUM_LEVELS; i++){
			levels[i] = new ParkirLevel(i, 30);
		}
	}
	
	public boolean parkVehicle(Kendaraan kendaraan){
		for (int i = 0; i < levels.length; i++){
			if (levels[i].parkVehicle(kendaraan))
				return true;
		}
		return false;
	}
}
