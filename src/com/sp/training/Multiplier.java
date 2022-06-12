package com.sp.training;

public class Multiplier extends BinaryExpression {

	public Multiplier(Expression left, Expression right) {
		super(left, right);
	}
	@Override
	public double getValue() {
		return this.left.getValue() * this.right.getValue();
	}

	public void change1()
	{
		System.out.println("Chaange 1 added");
	}

	public void change2()
	{
		System.out.println("Chaange 2 added");
	}

	public void change3()
	{
		System.out.println("Chaange 2 added");
	}

}
