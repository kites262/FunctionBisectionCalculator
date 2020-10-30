package kites.Math;

public class Interval {
	private double left,right;
	private boolean allow_left,allow_right;
	public Interval(double left,boolean a,double right,boolean b){
		setDomain(left,a,right,b);
	}
	public double getLeft(){
		return left;
	}
	public double getRight(){
		return right;
	}
	public boolean isAllow_left(){
		return allow_left;
	}
	public boolean isAllow_right(){
		return allow_right;
	}
	public void setDomain(double left,boolean a_left,double right,boolean a_right){
		this.left = left;
		this.right = right;
		this.allow_left = a_left;
		this.allow_right = a_right;
		reloadDomain();
	}
	public void setAllow(boolean left,boolean right){
		this.allow_left = left;
		this.allow_right = right;
	}
	public void reloadDomain(){
		if(right<left){
			{
				double temp = left;
				left = right;
				right = temp;
			}
			{
				boolean temp = allow_left;
				allow_left = allow_right;
				allow_right = temp;
			}
		}
	}
	public static Interval toInterval(String s){
		double a,b;
		boolean p = false;
		boolean q = false;
		p = s.startsWith("[");
		q = s.endsWith("]");
		s = s
				.replace("[","")
				.replace("]","")
				.replace("(","")
				.replace(")","")
				.replace(",","~");
		String[] n = s.split("~");
		a = Double.parseDouble(n[0]);
		b = Double.parseDouble(n[1]);
//		for(String result : n){
//			System.out.println(result);
//		}
		return new Interval(a,p,b,q);
//		return new Interval(1,true,2,true);
	}
}
