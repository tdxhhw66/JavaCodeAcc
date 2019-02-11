package designpattern.factory.simple.one;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("请输入数字A");
		String a = sc.nextLine();
		System.out.println("请选择运算符号：（+，-，*，/）：");
		String b = sc.nextLine();
		System.out.println("请输入数字B:");
		String c = sc.nextLine();
		String d = "";
		if ("+".equals(b)) {

			d = String.valueOf(Double.parseDouble(a) + Double.parseDouble(c));
		}

		if ("-".equals(b)) {

			d = String.valueOf(Double.parseDouble(a) - Double.parseDouble(c));
		}

		if ("*".equals(b)) {

			d = String.valueOf(Double.parseDouble(a) * Double.parseDouble(c));
		}

		if ("/".equals(b)) {

			d = String.valueOf(Double.parseDouble(a) / Double.parseDouble(c));
		}
		System.out.println("结果是：" + d);
	}
}
