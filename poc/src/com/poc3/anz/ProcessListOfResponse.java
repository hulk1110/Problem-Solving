package com.poc3.anz;

import java.util.List;

public interface ProcessListOfResponse extends ProcessPath {
	List<ResponseData> processAndConvertToListOfResponse();
}
