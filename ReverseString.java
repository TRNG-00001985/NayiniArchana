package reva;

public class ReverseString {
	public static void main(String args[]) {
		String s="Archana";
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res+=s.charAt(i);
		}
		System.out.println(res);
	}

}