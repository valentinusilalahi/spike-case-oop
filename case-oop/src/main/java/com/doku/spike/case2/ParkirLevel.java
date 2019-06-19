package com.doku.spike.case2;

/**
 * Created by IntelliJ IDEA.
 * User: valentinussilalahi
 * Date: 2019-06-17
 * Time: 15:28
 * To change this template use File | Settings | File and Code Templates.
 */
public class ParkirLevel {
	private int floor;
	private TitikParkir[] spots;
	private int parkirKosong = 0;
	private static final int PARKIRAN_PER_BARIS =10;

	public ParkirLevel(int flr, int noParkiran) {
		floor = flr;
		parkirKosong = noParkiran;
		spots = new TitikParkir[noParkiran];
		
		int largeSpots = noParkiran / 4;
		int bikeSpots = noParkiran /4;
		int compactSpots = noParkiran - largeSpots - bikeSpots;
		
		for(int i = 0; i< noParkiran; i++){
			JenisKendaraan jenisKendaraan = JenisKendaraan.SEPEDAMOTOR;
			if(i<largeSpots + compactSpots){
				jenisKendaraan = JenisKendaraan.MOBIL;
			}
			int baris = i / PARKIRAN_PER_BARIS;
			spots[i] = new TitikParkir(this, baris, i, jenisKendaraan);
		}
	}

	public int parkirKosong() {
		return parkirKosong;
	}

	public boolean parkVehicle(Kendaraan kendaraan) {
		if(parkirKosong() < kendaraan.getSpaceParkir())
			return false;
		
		int noParkiran = cariParkiranKosong(kendaraan);
		if(noParkiran < 0)
			return false;
		
		System.out.print(", Nomor Parkiran "+noParkiran);
		return parkiranTersedia(noParkiran, kendaraan);
	}

	private boolean parkiranTersedia(int num, Kendaraan kendaraan) {
		kendaraan.clearSpots();
		boolean success = true;
		for(int i = num; i < num + kendaraan.spaceParkir; i++ ){
			success &= spots[i].park(kendaraan);
		}
		parkirKosong -= kendaraan.spaceParkir;
		return success;
	}

	/* cari parkiran kendaraan.
	 * @return index of spot, or -1 on failure
	 **/
	private int cariParkiranKosong(Kendaraan kendaraan) {
		int parkiranTersedia = kendaraan.getSpaceParkir();
		int barisTerakhir = -1;
		int parkirDitemukan = 0;
		
		for(int i =0; i <spots.length; i++){
			TitikParkir spot = spots[i];
			if(barisTerakhir != spots[i].getBaris()){
				parkirDitemukan = 0;
				barisTerakhir = spots[i].getBaris();
			}
			
			if(spots[i].cekParkiranTersediaAtauTidak(kendaraan)){
				parkirDitemukan++;
			} else {
				parkirDitemukan =0;
			}
			
			if(parkirDitemukan == parkiranTersedia){
				if(kendaraan.jenisKendaraan == JenisKendaraan.MOBIL){
					System.out.print("Area Parkir Mobil");
				} else{
					System.out.print("Area Parkir Bus");
				}
				System.out.print("Baris Parkir : "+barisTerakhir);
				return i - (parkirDitemukan -1);
			}
		}
		return -1;
	}

	/*
	 * titik parkir kosong, kendaraan keluar
	 * */
	public void spotFreed() {
		parkirKosong++;
		System.out.print("Parkiran tersedia di : "+parkirKosong);
	}
}
