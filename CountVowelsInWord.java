//WAP to count vowels in word of string
//input= hello i am java developer 
//output=h1ll2 1 1m j1v2 d1v2l3p4r

class CountVowelsInWord
{
	public static void main(String args[])
	{
		/*String s1="hello i am java developer";
		StringBuilder sb=new StringBuilder();
		String s2[]=s1.split(" ");
		String vowels="AEIOUaeiou";
		for(int i=0; i<s2.length;i++)
		{
			int count=0;
			String temp=s2[i];
			for(int j=0; j<temp.length();j++)
				if(vowels.contains(String.valueOf(temp.charAt(j))))
					sb.append(++count);
				else
					sb.append(temp.charAt(j));
			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);*/



		String s1="hello i am java developer";
		StringBuilder sb=new StringBuilder();
		String vowels="AEIOUaeiou";
		int count=0;
		for(int i=0; i<s1.length();i++)
		{
			if(vowels.contains(String.valueOf(s1.charAt(i))))
				sb.append(++count);
			else if(s1.charAt(i)==' ')
			{
				count=0;
				sb.append(s1.charAt(i));
			}
			else
				sb.append(s1.charAt(i));
		}
		System.out.println(sb);
	



	}
}
			