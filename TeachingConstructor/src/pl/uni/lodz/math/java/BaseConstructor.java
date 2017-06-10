package pl.uni.lodz.math.java;

public class BaseConstructor {
	public OtherConstructor other;
	public BaseConstructor(){
		System.out.println("Block B-1");
		other = new OtherConstructor();
	}
	{
		System.out.println("Block B-2");
	}
	{
		System.out.println("Block B-2.1");
	}
	{
		System.out.println("Block B-2.2");
	}
	static{
		System.out.println("Block B-3");
	}


}
