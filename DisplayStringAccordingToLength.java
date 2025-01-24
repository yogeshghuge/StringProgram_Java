//WAP to display string according to the length of character
//Input= hello i am java developer
//output=i am java hello developer

class DisplayStringAccordingToLength
{
	public static void main(String argss[])
	{
		String s1="hello i am java developer";
		String s2[]=s1.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<s2.length-1;i++)
			for(int j=i+1;j<s2.length;i++)
				if(s2[i].length()>s2[j].length())
				{
					String temp=s2[i];
					s2[i]=s2[j];
					s2[j]=temp;
				}
		for(int i=0; i<s2.length;i++)
		{
			sb.append(s2[i]);
			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);
	}
}
