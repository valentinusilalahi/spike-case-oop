package com.doku.spike.case2;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: valentinussilalahi
 * Date: 2019-06-17
 * Time: 13:49
 * To change this template use File | Settings | File and Code Templates.
 */
@Getter
@Setter
public abstract class Kendaraan {
	protected ArrayList<TitikParkir> titikParkirs = new ArrayList<TitikParkir>();
	protected String platNomorKendaraan;
	protected int spaceParkir;
	protected JenisKendaraan jenisKendaraan;

	public int getSpaceParkir() {
		return spaceParkir;
	}

	public JenisKendaraan getJenisKendaraan() {
		return jenisKendaraan;
	}

	/* kendaraan kemungkinan bisa parkir */
	public void parkInSpot(TitikParkir s) {
	 	titikParkirs.add(s);
	}

	/* hapus kendaraan dari titik parkir jika kendaraan sudah pergi */
	public void clearSpots() {
		for(int i =0; i< titikParkirs.size(); i++){
			titikParkirs.get(i).removeVehicle();
		}
	}

	public abstract boolean cekKendaraanYangBisaParkir(TitikParkir spot);
}