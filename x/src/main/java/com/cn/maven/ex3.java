package com.cn.maven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


public class ex3 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int count;
//		count=count("d");
//		System.out.println(count);
//
//	}
	public  int count (String key) {
		int count=0;
		File f=new File("D:\\log.txt");
		String content;
		
		try {
			content=FileUtils.readFileToString(f, "utf-8");
			while (content.contains(key)) {
				int i=content.indexOf(key);
				content=content.substring(i+1);
				count++;
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
}
