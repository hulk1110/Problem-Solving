package com.poc2.anz;

public class PathB implements ChainOfPaths{

	private ChainOfPaths nextPath;
	@Override
	public void setNext(ChainOfPaths nextInChain) {
		// TODO Auto-generated method stub
		nextPath= nextInChain;
	}

	@Override
	public void process(Path path) {
		// TODO Auto-generated method stub
		if(path.getPathName().equals("B")){
			System.out.println("this is path B <---> corresponding logic for response body can be written here");
		}else{
			nextPath.process(path);
		}
	}


}
