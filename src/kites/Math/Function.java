package kites.Math;

public class Function {
	private Interval domain;
	public Function(double domainL,boolean L,double domainR,boolean R){
		this.domain = new Interval(domainL,L,domainR,R);
	}
	public double f(double x){
		double fx = Integer.MIN_VALUE;
		if(
				x >= domain.getLeft() && x <= domain.getRight()
		){
			fx = function(x);
		}
		return fx;
	}
	public double function(double x){
		return x;
	}
	public double bisection(Interval domain,double s){
		boolean done = false;
		double a = domain.getLeft();
		double b = domain.getRight();
		double c;
/*			while(!done){
				c = (a+b)/2.0;
				if(f(a)*f(c)<0){
					b = c;
				}else{
					a = c;
				}
				if (f(c)==0) {
					a = c;
					done = true;
				}
				if(Math.abs(a-b)<s){
					done = true;
				}
			}*/
		while(!done){
			c = (a+b)/2.0;
			if(f(a)*f(c)<0){
				b = c;
			}else{
				a = c;
			}
			if(f(c)==0){
				done = true;
			}
			if(Math.abs(a-b)<s){
				done = true;
			}
		}
		return a;
	}

}
