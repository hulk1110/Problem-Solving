package com.poc2.anz;

public interface ChainOfPaths {

	public abstract void setNext(ChainOfPaths nextInChain);

	public abstract void process(Path path);

}
