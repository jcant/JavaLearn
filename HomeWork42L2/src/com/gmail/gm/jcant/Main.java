package com.gmail.gm.jcant;

public class Main {

	public static void main(String[] args) {
		
		long range = 30000000L;
		long count=0;
		
		for (long i=2;i<=range; i++) {
			
			long currentRange = (long)Math.sqrt(i);
			boolean simpleFlag = true;
			
			for(long j=2; j<=currentRange; j++) {
				if (i%j == 0) {
					simpleFlag = false;
					break;
				}
			}
			
			if (simpleFlag) {
				System.out.print(""+i+"; ");
				count++;
			}
			
			if (i%100==0) {
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println("Total: "+count);

	}

}
