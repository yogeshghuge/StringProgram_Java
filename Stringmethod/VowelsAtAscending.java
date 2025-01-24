//WAP to display vowels at first at ascending order
// input=International
//output=Iaaeiolnnnrtt

class VowelsAtAscending
{
	public static void main(String args[])
	{
		String s1="Internation";
		char c[]=s1.toCharArray();
		String vowels="AEIOUaeiou";
		Arrays.sort(c);
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		for(int i=0; i<c.length;i++)
			if(vowels.contains(String.valueOf(c[i])))
				sb1.append(c[i]);
			else
				sb2.append(c[i]);
		sb1.append(sb2);
		System.out.println(sb1);
	}
}