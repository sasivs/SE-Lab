
public class OTPGen {
	public int genOTP(int n) {
		String result = "";
		String input = Integer.toString(n);
		int last_index = input.length()-1;
		if ((last_index%2)!=0) {
			last_index = last_index-1;
		}
		for(int i=last_index; i>=0 && result.length()<4; i=i-2) {
			result = Integer.toString((int)Math.pow(Character.getNumericValue(input.charAt(i)),3)) + result;
		}
		while(result.length()<4) {
			result = result + "0";
		}
		return Integer.parseInt(result.substring(result.length()-4, result.length()));
	}
}
