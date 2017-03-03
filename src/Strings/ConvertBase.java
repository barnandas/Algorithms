package Strings;

public class ConvertBase {

	/*
	 * Convert a number from base b1 to base b2
	 */
	public static String convertBase(String s, int b1, int b2) {
		boolean isNeg = s.startsWith("-");
		
		int intNum = 0;
		for (int i=s.length()-1, j=0; i>= (isNeg?1:0); i--, j++) {
			intNum += Math.pow(b1, j) * 
					( Character.isDigit(s.charAt(i))? (int)(s.charAt(i) - '0'): (int)(s.charAt(i) - 'A' + 10) );
		}
		
		StringBuffer str = new StringBuffer();
		int rem;
		while (intNum !=0) {
			rem = intNum % b2;
			str.append( (char)( rem<10? '0' + rem : ('A' + rem - 10) ) );
			intNum /= b2;
		}
		
		if (isNeg) {
			str.append('-');
		}
		
		str.reverse();
		
		return str.toString();
	}
	
	
	public static void main(String[] args) {
		String num = "615";
		int b1 = 7;
		int b2 = 10;
		
		String result = convertBase(num, b1, b2);
		System.out.println("Original in base " + b1 + ": " + num);
		System.out.println("Converted in base " + b2 + ": " + result);
	}

}
