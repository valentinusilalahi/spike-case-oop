package com.doku.spike.case4;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: valentinussilalahi
 * Date: 2019-06-19
 * Time: 15:53
 * To change this template use File | Settings | File and Code Templates.
 */
public class DemoApp {
	public static void main(String[] xxx){
		Scanner input = new Scanner(System.in);
		String jenisKendaraan = "";
		MotorCycle motorCycle = new MotorCycle();
		Car car = new Car();
		Bus bus = new Bus();
		
		System.out.print("Jenis Kendaraan : ");
		jenisKendaraan = input.next();
		
		if ("sepedamotor".equalsIgnoreCase((jenisKendaraan.toLowerCase()))) {
			motorCycle.area();
		} else if ("car".equalsIgnoreCase((jenisKendaraan.toLowerCase()))) {
			car.area();
		} else if ("bus".equalsIgnoreCase(jenisKendaraan.toLowerCase())) {
			bus.area();
		} else {
			System.out.println("Kendaraan Tidak ada");
		}
	}
}
