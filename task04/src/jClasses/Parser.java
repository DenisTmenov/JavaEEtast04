package jClasses;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

public class Parser {
	public static String start(String strStart, HttpServletRequest request)
			throws IOException {
		HashMap<String, String> paramFromRequest = CreateHashMap.create(request);
		for (HashMap.Entry<String, String> entry : paramFromRequest.entrySet()) {
			strStart = strStart.replaceAll("\\$\\{" + entry.getKey() + "\\}", entry.getValue());
		}
		strStart = strStart + "\r\n";
		return strStart;
	}
}
