package com.doku.spike.case4;

/**
 * Created by IntelliJ IDEA.
 * User: valentinussilalahi
 * Date: 2019-06-19
 * Time: 15:59
 * To change this template use File | Settings | File and Code Templates.
 */
public abstract class Park {
	Integer perulangan;
	String tempat[] = {"SepedaMotor", "Mobil", "Bus"};
	
	public void pesan(){
		System.out.println("Lot Parkir Yang di Perbolehkan :");
	}
}
