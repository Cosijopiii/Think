package ejemplos;

public class E4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(lessDecimal(2.1234, 4));

	}

	public static double lessDecimal(double num, int res) {
		String numF = String.valueOf(num);
		StringBuilder milD = new StringBuilder("1");
		double r = Double.valueOf(numF.substring(numF.length() - res,numF.length()));
		for (int i = 0; i < numF.length(); i++) 
			if (!(numF.charAt(i) == '-' || numF.charAt(i) == '.')) 
				if (i != 0)
					milD.append("0");	
		System.out.println(numF + " " + r + " " + milD);
		return num - (r / Double.parseDouble(milD.toString()));
	
		}
	
}
