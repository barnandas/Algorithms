package PrimitiveTypes;

import java.util.ArrayList;

public class Examples {

	public static byte countBits(int x) {
		byte numBits = 0;
		
		while (x != 0) {
			numBits += (x & 1);
			x = x >>> 1;
		}
		
		return numBits;
	}
	
	public static void main(String[] args) {
		
		countBits(3);
		
		ArrayList<Long> list = new ArrayList<Long>();
		list.add(1, (long) 12365);
		

	}

}
