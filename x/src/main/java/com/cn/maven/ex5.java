package com.cn.maven;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.cn.maven.*;

import org.apache.commons.io.FileUtils;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		homework();

	}
	public static  void homework() {
		ex4 f1=new ex4();
		ex3 f2=new ex3();
		String str1=f1.substr();
//		System.out.println(str1);
		String str=str1.replaceAll("\r\n", "");
		String str3=str.replaceAll("\t", "");
		String str4=str3.replaceAll(" ", "");
		String str2[]=str4.split("");
		String [][]v=new String [2][str2.length];
		int i=0;
		int j=0;
		for (i=0;i<str2.length;i++) {
			v[0][i]=str2[i];
			System.out.println(v[0][i]);
			System.out.println(str2[i]);
			int count=f2.count(str2[i]);
			v[1][i]=String.valueOf(count);	
		}
		for(i=0;i<str2.length;i++) {
			for(j=0;j<2;j++) {
				System.out.print(v[j][i]+" ");
			}
			System.out.println("");
		}
		String a=v[1][0];
		for (i=0;i<str2.length-1;i++) {
			
			if(Integer.parseInt(a)<Integer.parseInt(v[1][i+1])) {
				a=v[1][i+1];
				}
			
		}
		System.out.println(a);
		for (i=0;i<str2.length-1;i++) {
			
			if(v[1][i].equals(a)) {
				System.out.println(v[0][i]);
				}
			
		}

	}

}
