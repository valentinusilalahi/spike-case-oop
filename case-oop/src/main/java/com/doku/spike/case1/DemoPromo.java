package com.doku.spike.case1;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: valentinussilalahi
 * Date: 2019-06-17
 * Time: 11:07
 * To change this template use File | Settings | File and Code Templates.
 */
public class DemoPromo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ammount : Rp. ");
		float ammount = scan.nextFloat();
		System.out.print("Kode Promo : ");
		String kodePromo = scan.next();
		Diskon diskon = new Diskon(ammount, kodePromo);
		
		System.out.println(diskon.toString());
	}
	
}
