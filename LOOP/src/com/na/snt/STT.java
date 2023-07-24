package com.na.snt;

public class STT {
	public boolean isPrime(int i) {
		boolean answer=true;
		if(i<2) {
			answer=false;
		}else {
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					answer=false;
					break;
				}
			}
		}
		System.out.println(answer);
		return answer;
	}
}
