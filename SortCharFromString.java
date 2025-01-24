//WAP to sort each character from string 
//input= International
//output=Iaaeilnnnortt

import java.util.Arrays;
class SortCharFromString
{
	public static void main(String args[])
	{
		String s1="International";
		char[] ch = s1.toCharArray();
        	Arrays.sort(ch);
        	String s2 = new String(ch);
       	        System.out.println(s2);
	}
}