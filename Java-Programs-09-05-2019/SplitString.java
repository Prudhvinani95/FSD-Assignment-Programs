class Splitting
{
	public static String[] mysplit(String str, String delimiter)
	{
		String temp = str;
		String str2;
		String []arr = new String[str.length()];
		int index; int inc=0;
		int dlen=delimiter.length();
		while(temp.length()>0)
		{
			index = temp.indexOf(delimiter);
			if(index != -1)
			{
				arr[inc] = temp.substring(0,index);
				inc ++;
				str2 = temp.substring(0,index+dlen);
				temp = temp.replaceFirst(str2,"");
			}
			else
			{
				arr[inc] = temp;
				break;
			}
		}
		return arr;
	}
}
class SplitString
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter string and delimiter");
		String str = sc.nextLine();
		String delimeter = sc.nextLine();
		String []arr = Splitting.mysplit(str,delimeter);
		System.out.println("Split array:");
		for (int i = 0; i < arr.length; i++ ) {
			if(arr[i] != null)
				System.out.println(arr[i]);	
			else
				break;		
		}
	}
}