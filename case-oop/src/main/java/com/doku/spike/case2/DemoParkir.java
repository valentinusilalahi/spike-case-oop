package com.doku.spike.case2;

/**
 * Created by IntelliJ IDEA.
 * User: valentinussilalahi
 * Date: 2019-06-18
 * Time: 09:55
 * To change this template use File | Settings | File and Code Templates.
 */
public class DemoParkir {
	public static void main(String[] args) {
		LotParkir lotParkir = new LotParkir();
		
		SepedaMotor sm = new SepedaMotor();
		Mobil m = new Mobil();
		Bus b = new Bus();
		
		lotParkir.parkVehicle(sm);
		lotParkir.parkVehicle(m);
		lotParkir.parkVehicle(b);
		
	}
}
