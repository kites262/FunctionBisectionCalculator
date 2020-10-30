import kites.Math.Function;
import kites.Math.Interval;

import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Interval domain;
		double s;
		Function fun = new Function(-256,true,256,false){
			public double function(double x){
				return
						x*x-50*x+97;
			}
		};
		System.out.println("--Bisection for zero point--");

		System.out.println("Domain:");
		domain = Interval.toInterval(scanner.nextLine());
		System.out.println("Epsilon:");
		s = scanner.nextDouble();
		double a = fun.bisection(domain,s);
		System.out.println("The result:");
		System.err.println(a);
	}
}
