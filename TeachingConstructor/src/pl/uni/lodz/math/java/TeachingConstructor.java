package pl.uni.lodz.math.java;


public class TeachingConstructor extends BaseConstructor implements GlobalConstructor{
	public OtherConstructor other;
	public TeachingConstructor(int x) {
		// TODO Auto-generated constructor stub
		System.out.println("Block A");
	};
	public TeachingConstructor() {
		// TODO Auto-generated constructor stub
		System.out.println("Block B");
		other = new OtherConstructor();
	};
	{
		// TODO Auto-generated constructor stub
		System.out.println("Block C");
	};
	static {
		System.out.println("Block D");
	};
	
	@Override
	public void CoolFunction() {
		// TODO Auto-generated method stub
	};
}
	


