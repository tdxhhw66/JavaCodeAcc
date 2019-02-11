package designpattern.factory.simple.two;

public class Operation {

	public static double getResult(double numberA, double numberB, String operate) {

		double d = 0d;
		if ("+".equals(operate)) {

			d = numberA + numberB;
		}

		if ("-".equals(operate)) {

			d = numberA - numberB;
		}

		if ("*".equals(operate)) {

			d = numberA * numberB;
		}

		if ("/".equals(operate)) {

			d = numberA / numberB;
		}
		return d;
	}
}
