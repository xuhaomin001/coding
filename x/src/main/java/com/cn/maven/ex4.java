package com.cn.maven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ex4 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String str1=substr();
//		System.out.println(str1);
//
//	}
    public  String substr() {
    	File f=new File("D:\\log.txt");
		String content;
		StringBuilder sb = new StringBuilder();
		try {
			content=FileUtils.readFileToString(f, "utf-8");
			String[] s=content.split("");
			
			int i=0;
			int n=s.length;
			
			while (i<n) {
				if(sb.indexOf(s[i])!=-1) {
					i++;
				}
				else {
					sb.append(s[i]);
					i++;
				}
			}

		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
		
    }
}
