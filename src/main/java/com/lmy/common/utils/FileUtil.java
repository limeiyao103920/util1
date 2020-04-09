package com.lmy.common.utils;

public class FileUtil {

	public static String getExtendName(String fileName){
		//获取文件名之后分割
		String[] split = fileName.split(",");
		//获取名字的后面部分
		String name="."+split[split.length];
		return name;
		}

}
