package com.doku.spike.case2;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by IntelliJ IDEA.
 * User: valentinussilalahi
 * Date: 2019-06-17
 * Time: 15:21
 * To change this template use File | Settings | File and Code Templates.
 */
@Getter
@Setter
public class TitikParkir {
	private Kendaraan kendaraan;
	private JenisKendaraan jenisKendaraan;
	private int baris;
	private int noParkiran;
	private ParkirLevel parkirLevel;
	
	public TitikParkir(ParkirLevel lvl, int r, int n, JenisKendaraan s) {
		jenisKendaraan = s;
		parkirLevel = lvl;
		noParkiran = n;
		baris = r;
	}

	public boolean parkiranKosong() {
		return kendaraan == null;
	}

	/* Check ketersediaan parkiran */
	public boolean cekParkiranTersediaAtauTidak(Kendaraan kendaraan) {
		return parkiranKosong() && kendaraan.cekKendaraanYangBisaParkir(this);
	}

	/* parkiran tersedia */
	public boolean park(Kendaraan kendaraan) {
		if(!cekParkiranTersediaAtauTidak(kendaraan));
		return false;
	}

	/*
	 * hapus kendaraan dalam spot dan beri notif ke
	 * parkiranLevel untuk menambahkan space baru
	 * */
	public void removeVehicle() {
		parkirLevel.parkirKosong();
		kendaraan = null;
	}
}
