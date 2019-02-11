package designpattern.factory.simple;

import java.util.Scanner;

/**
 * 使用工厂方法生成实例完成运算操作
 * 
 * @author liu yuning
 *
 */
public class Calculator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字A：");
		String a = sc.nextLine();
		System.out.println("请选择运算符号：（+，-，*，/）：");
		String operator = sc.nextLine();
		System.out.println("请输入数字B：");
		String c = sc.nextLine();

		Operation operation = OperationFactory.createOperation(operator);
		operation.numberA = Double.parseDouble(a);
		operation.numberB = Double.parseDouble(c);

		System.out.println(operation.result());
		
		sc.close();
	}
}