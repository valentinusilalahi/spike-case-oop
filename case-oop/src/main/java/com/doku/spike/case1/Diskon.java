package com.doku.spike.case1;

/**
 * Created by IntelliJ IDEA.
 * User: valentinussilalahi
 * Date: 2019-06-17
 * Time: 11:06
 * To change this template use File | Settings | File and Code Templates.
 */
public class Diskon implements DiskonService {
	private float ammount;
	private String kodePromo;
	private String diskon;
	
	public Diskon(float ammount, String kodePromo) {
		this.ammount = ammount;
		this.kodePromo = kodePromo;
		
		if ("New Year".equals(kodePromo)) {
			this.diskon = "5%";
		} else if ("Lebaran".equals(kodePromo)) {
			this.diskon = "10%";
		} else if ("Harbolnas".equals(kodePromo)) {
			this.diskon = "20%";
		} else {
			this.diskon = "0%";
		}
	}
	
	public double hitungDiskon(double ammount, String kodePromo) {
		double finalAmmount;
		if ("New Year".equals(kodePromo)) {
			finalAmmount = (ammount * 5) / 100;
		} else if ("Lebaran".equals(kodePromo)) {
			finalAmmount = (ammount * 10) / 100;
		} else if ("Harbolnas".equals(kodePromo)) {
			finalAmmount = (ammount * 20) / 100;
		} else {
			finalAmmount = ammount;
		}
		return finalAmmount;
	}
	
	public String toString() {
		double total = this.ammount - hitungDiskon(this.ammount, this.kodePromo);
		return "Discount: " + this.diskon + "\n" + "Ammount yang harus dibayar: " + total;
	}
}
