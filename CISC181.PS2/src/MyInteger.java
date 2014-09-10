
public class MyInteger 
{
	private int value;

	public MyInteger(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public static boolean isEven(int value)
	{
		return (value % 2 == 0);
	}
	
	public static boolean isOdd(int value)
	{
		return !isEven(value);
	}
	
	public static boolean isPrime(int value)
	{
		for (int i = 2; i < value / 2; i++)
		{
			if(value % i == 0)
			{
				return false;
			}
		}
		return true;
		
	}
	 public static boolean isEven(MyInteger x)
	 {
		 return x.isEven();
	 }
	 
	 public static boolean isOdd(MyInteger x)
	 {
		 return x.isOdd();
	 }
	 
	 public static boolean isPrime(MyInteger x)
	 {
		 return x.isPrime();
	 }
	 
	 public boolean isEven()
	 {
		 return isEven(this.value);
	 }
	 
	 public boolean isOdd()
	 {
		 return isOdd(this.value);
	 }
	 
	 public boolean isPrime()
	 {
		 return isPrime(this.value);
	 }
	 
	 public boolean equals(int value)
	 {
		 return (this.value == value);
	 }
	 
	 public boolean equals(MyInteger x)
	 {
		 return equals(x.getValue());
	 }
	 
	 public static int parseInt(char[] s)
	 {
		 return parseInt(new String(s));
	 }
	 
	 public static int parseInt(String s)
	 {
		 return Integer.parseInt(s);
	 }



}
