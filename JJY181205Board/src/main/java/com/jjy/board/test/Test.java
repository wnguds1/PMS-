package com.jjy.board.test;

import java.io.*;

public class Test {
	public static void main(String[] args) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("curl",
				"-g", 
				"http://localhost:81/redmine/issues/2.json?key=b579df13ce6a80d247fbe91358024acfb6d91ac3");
		System.out.println("Asdf"+pb);
		Process p = pb.start();
		InputStream is = p.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		StringBuilder responseStrBuilder = new StringBuilder();

		String line = new String();

		while ((line = br.readLine()) != null) {
		    System.out.println("read line from curl command: " + line);
		    responseStrBuilder.append(line);
		}
		
	}
}
