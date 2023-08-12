
public class Substring {
	public boolean matched(String s, int n, int i) {
		if ((i+1)>=s.length()) {
			return false;
		}
		for(int j=i+1; j<(n+i) && j<s.length(); j++) {
			if (s.charAt(i)!=s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	public String substring(String s, int n) {
		boolean flag = true, matched;
		String result="";
		while (flag){
			result = "";
			flag=false;
			int i = 0;
			while(i<s.length()) {
				matched = matched(s, n, i);
				if (!matched) {
					result= result+s.charAt(i);
					i++;
				}
				else{
					i=i+n;
					flag=true;
				}
			}
			s=result;
		}
		return result;
	}
}
