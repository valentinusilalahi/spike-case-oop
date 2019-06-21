package com.doku.spike.case6;

/**
 * Created by IntelliJ IDEA.
 * User: valentinussilalahi
 * Date: 2019-06-21
 * Time: 15:50
 * To change this template use File | Settings | File and Code Templates.
 */
public class NewYear extends Promo {

	public Double nilaiPotongan(Double amount) {
		Double discount = 0.05;
		if (amount < 10000) {
			return 0.00;
		}
		
		return discount * amount;
		
		
	}
}
