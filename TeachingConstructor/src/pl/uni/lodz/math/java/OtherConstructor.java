package pl.uni.lodz.math.java;

public class OtherConstructor {
	public OtherConstructor() {
		System.out.println("Other-1");
	}
	{
		System.out.println("Other-2");
	}
	
	static {
		System.out.println("Block T");
	};

}
