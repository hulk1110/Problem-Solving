package com.poc2.anz;

public class TestTheChaining {
public static void main(String[] args) {
	// configuring sequence
	ChainOfPaths path1 = new PathA();
	ChainOfPaths path2 = new PathB();
	ChainOfPaths path3 = new PathC();
	path1.setNext(path2);
	path2.setNext(path3);
	
	path1.process(new Path("C"));
}
}
