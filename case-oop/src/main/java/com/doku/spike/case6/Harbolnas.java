package com.doku.spike.case6;

/**
 * Created by IntelliJ IDEA.
 * User: valentinussilalahi
 * Date: 2019-06-21
 * Time: 16:06
 * To change this template use File | Settings | File and Code Templates.
 */
public class Harbolnas extends Promo {
	public Double nilaiPotongan(Double amount) {
		Double discount = 0.1;
		if (amount < 20000) {
			return 0.00;
		}
		
		return discount * amount;
	}

	public Double pajak(Double amount) {
		Double nilaiPajak = 0.5;
		return amount * nilaiPajak;
	}
}
