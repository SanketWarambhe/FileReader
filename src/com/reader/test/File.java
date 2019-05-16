package com.reader.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class File {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			InputStream inputStream = File.class.getResourceAsStream("/com/reader/text/index.html");
			InputStreamReader inputReader = new InputStreamReader(inputStream);
			br = new BufferedReader(inputReader);
			String line;
			
			while((line =br.readLine()) != null) {
				System.out.println(line);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
