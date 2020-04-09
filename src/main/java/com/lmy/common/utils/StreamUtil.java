package com.lmy.common.utils;

import java.io.File;
import java.io.FileInputStream;

import java.io.InputStream;

public class StreamUtil {

	public static void closeAll(FileInputStream file,InputStream src) throws Exception{
		file.close();
		}
	public static int readTextFile(InputStream src) throws Exception{
		//TODO 实现代码
		 int read = src.read();
		 //调用第一个
		 StreamUtil.closeAll(null, src);
		return read;
		}
	public static String readTextFile(File txtFile){
		//调用第二个
		return StreamUtil.readTextFile(txtFile);
		}

}
