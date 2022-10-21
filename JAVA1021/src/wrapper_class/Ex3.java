package wrapper_class;

public class Ex3 {
	
	public static void main(String[] args) {
		
		String strNum = "100.0";
		
		double dNum = Double.parseDouble(strNum);
		System.out.println(dNum);
		
		Double dNum2 = new Double(strNum);
		
		System.out.println(dNum2);
		
		strNum = "1234";
		int iNum = Integer.parseInt(strNum);
		System.out.println(iNum);
				
	}
}
