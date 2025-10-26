package com.nt.payment;

public class UPIPayment {
	
	
	public String doPaymenyUsingPhonePe(long phoneno,double amount) {
		return amount+" Payment is happening from the phone no ::"+phoneno+" using Phonepe";
	}
	public String doPaymenyUsingGPay(long phoneno,double amount) {
		return amount+" Payment is happening from the phone no ::"+phoneno+" using GPay";
	}

}
