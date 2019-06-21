package com.doku.spike.case6;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: valentinussilalahi
 * Date: 2019-06-21
 * Time: 15:54
 * To change this template use File | Settings | File and Code Templates.
 */
public class Main {
	
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		Double amount = 20000.00;
		String promoCode = "NEWYEAR";
		
		
		Class clazz = Class.forName(Main.parseClass(promoCode));
		
		Promo promo = (Promo) clazz.newInstance();
		Double potongan = promo.nilaiPotongan(amount);
		System.out.println("potongan : "+potongan);
		System.out.println("pajak : "+promo.pajak(amount));
		
	}
	
	private static String parseClass(String promoCode) {
		Map<String, String> data = new HashMap<String, String>();
		data.put("newyear", "com.doku.spike.case6.NewYear");
		data.put("harbolnas", "com.doku.spike.case6.Harbolnas");
		
		
		return data.get(promoCode.toLowerCase());
	}
}
