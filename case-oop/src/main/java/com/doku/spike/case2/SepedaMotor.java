package com.doku.spike.case2;

/**
 * Created by IntelliJ IDEA.
 * User: valentinussilalahi
 * Date: 2019-06-17
 * Time: 14:03
 * To change this template use File | Settings | File and Code Templates.
 */
public class SepedaMotor extends Kendaraan {
	
	public SepedaMotor(){
		spaceParkir = 5;
		jenisKendaraan = JenisKendaraan.SEPEDAMOTOR;
	}
	
	/**
	 *  cek parkiran SepedaMotor ada atau tidak
	 * @return true
	 */
	public boolean cekKendaraanYangBisaParkir(TitikParkir spot){
		return true;
	}
	
}
