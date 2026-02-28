package akki;

public class Revesrthing {

	public static void main(String[] args) {
		String out="";
	String s="Akshat is good boy IN INDIA";
	String[] Str=s.split(" ");
	
	char[] st=Str[5].toCharArray();
	
	System.out.println(Str[5]);
	
	for(int i=st.length-1;i>=0;i--) {
		
		out=out+st[i];
		
		
		
		
		
		
	}

	System.out.println(out);
	
	String s1=Str[0]+" "+Str[1]+" "+Str[2]+" "+Str[3]+" "+Str[4]+" "+out;
	System.out.println(s1);
	}

}
