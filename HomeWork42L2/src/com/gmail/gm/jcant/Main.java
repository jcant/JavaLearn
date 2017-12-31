package com.gmail.gm.jcant;

public class Main {

	public static void main(String[] args) {
		
		int range = 100;
		
		for (int i=2;i<=range; i++) {
			
			int currentRange = (int)Math.sqrt(i);
			boolean simpleFlag = true;
			
			for(int j=2; j<=currentRange; j++) {
				if (i%j == 0) {
					simpleFlag = false;
					break;
				}
			}
			
			if (simpleFlag) {
				System.out.print(""+i+"; ");
			}
			
			if (i%100==0) {
				System.out.println();
			}
		}

	}

}
