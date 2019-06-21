package com.doku.spike.case6;

/**
 * Created by IntelliJ IDEA.
 * User: valentinussilalahi
 * Date: 2019-06-21
 * Time: 15:47
 * To change this template use File | Settings | File and Code Templates.
 */
public abstract class Promo {
	
	public abstract Double nilaiPotongan(Double amount);
	
	public Double pajak(Double amount) {
		Double nilaiPajak = 0.1;
		return amount * nilaiPajak;
	}
	
}
