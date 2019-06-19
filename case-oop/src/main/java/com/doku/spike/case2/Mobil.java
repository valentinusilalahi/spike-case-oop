package com.doku.spike.case2;

/**
 * Created by IntelliJ IDEA.
 * User: valentinussilalahi
 * Date: 2019-06-17
 * Time: 14:04
 * To change this template use File | Settings | File and Code Templates.
 */
public class Mobil extends Kendaraan {
	public Mobil(){
		spaceParkir = 1;
		jenisKendaraan = JenisKendaraan.MOBIL;
	}
	
	/**
	 *  cek parkiran Mobil ada atau tidak
	 * @return true
	 */
	public boolean cekKendaraanYangBisaParkir(TitikParkir titikParkir){
		return titikParkir.getJenisKendaraan() == JenisKendaraan.MOBIL ||
					   titikParkir.getJenisKendaraan() == JenisKendaraan.SEPEDAMOTOR;
	}
}
