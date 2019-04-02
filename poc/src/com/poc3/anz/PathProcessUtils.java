package com.poc3.anz;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PathProcessUtils {

	private static  Map<String, ProcessPath> PATHS=null;

	static {
		 Map<String, ProcessPath> paths = new HashMap<>();

		// case:1 when we return only the response data

		paths.put("PATH-A", new ProcessCollection() {

			@Override
			public ResponseData processCollection() {
				// TODO Auto-generated method stub
				return new ResponseData(1, "this path is returing a simple object");
			}

			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println(processCollection());
			}
		});

		// case:2 when we return the list of response data
		paths.put("PATHB", new ProcessListOfResponse() {

			List<ResponseData> responseDatas = null;

			@Override
			public List<ResponseData> processAndConvertToListOfResponse() {
				// TODO Auto-generated method stub
				responseDatas.add(new ResponseData(1, "this is first Entry"));
				responseDatas.add(new ResponseData(2, "this is second Entry"));
				responseDatas.add(new ResponseData(3, "this is third Entry"));
				responseDatas.add(new ResponseData(4, "this is fourth Entry"));
				return responseDatas;
			}

			@Override
			public void display() {
				// TODO Auto-generated method stub
			       System.out.println("This is case two in which we are getting list of response");
		
				System.out.println(Arrays.toString(responseDatas.toArray()));
			

			}});

		// case:3 when we return response of list of datas
		paths.put("PATHC", new ProcessListOfCollection() {

			@Override
			public CutomResponse processListOfCollection() {
				// TODO Auto-generated method stub

				List<ResponseData> responseDatas = null;
				responseDatas.add(new ResponseData(1, "this is first Entry"));
				responseDatas.add(new ResponseData(2, "this is second Entry"));
				responseDatas.add(new ResponseData(3, "this is third Entry"));
				responseDatas.add(new ResponseData(4, "this is fourth Entry"));
				CutomResponse cutomResponse = new CutomResponse();
				cutomResponse.setResponseDatas(responseDatas);

				return cutomResponse;
			}

			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("Hello");
			}
		});
		
		
		
		
		
		
	

		PATHS = Collections.unmodifiableMap(paths);
	}
	
	
	
	public ProcessPath createPojoforPath(String pathProvided) {
		ProcessPath path = PATHS.get(pathProvided);

		if (path == null) {
			throw new IllegalArgumentException("Invalid path type: " + pathProvided);
		}

		return path;
	}

}