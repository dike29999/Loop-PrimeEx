package com.na.loop;

public class LOOP {
	public int tong=0;
	
	public int total(int tong) {
		this.tong=tong;
		for(int i=0;i<100;i++) {
			tong=tong+i;
		}
		System.out.println(tong);
		return tong;
	}
	public int totalEven(int tong) {
		this.tong=tong;

		for(int i=0;i<100;i++) {
			if(i%2!=0) {
				continue;
			}
			tong=tong+i;
		}
		System.out.println(tong);
		return tong;
	}
}
