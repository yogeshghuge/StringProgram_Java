//WAP to find number from the string 
//input= first world war started on 1914 to 1918 and second world war started on 1939 to 1945
//output=1914 1918 1939 1945

//import java.util.Arrays;
class FindNumberFromString
{
	public static void main(String args[])
	{
		String s1="first world war started on 1914 to 1918 and second world war started on 1939 to 1945";
		String s2[]=s1.split(" ");
		for(int i=0; i<s2.length;i++)
		{
			if(Character.isDigit(s2[i].charAt(0)))
				System.out.print(s2[i]+" ");
		}
	}
}