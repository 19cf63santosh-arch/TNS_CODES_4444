package com.tns.polymorphism;

public class MethodOverloading {
	public static int addition(int a)
	{ 
		return a;
	}
	public static int addition(int a ,int b)
	{ 
		return a+b;
	}
	public static float addition(float b)
	{ 
		return b;
	}
}

package com.tns.polymorphism;

public class OverridingDemo 
{
	public static void main(String[] args)
	{
		RBI rbi;
		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterest());
		rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());

	}

}

package com.tns.polymorphism;

public class RBI 
{
	public float getRateOfInterest()
	{
		return 8.0f;
	}
}

package com.tns.polymorphism;

public class SBI extends RBI
{
	public float getRateOfInterest()
	{
		return 8.50f;
	}
}

package com.tns.polymorphism;

public class HDFC extends RBI
{
	public float getRateOfInterest()
	{
		return 9.0f;
	}

}




