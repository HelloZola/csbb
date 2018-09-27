package com.vi.common.utils;

import java.util.UUID;

public class UuidUtil {

	private static final String TEMP_KEY = "iottemp";
	
	public static String getTempCacheKey(){
		String str = UUID.randomUUID().toString();
		return TEMP_KEY+str.substring(0, 8) + str.substring(9, 13) + str.substring(14, 18) + str.substring(19, 23) + str.substring(24);
	}
	
	
	public static  String getUnionKey(){
		
		try{
			synchronized(UuidUtil.class){
				String str = UUID.randomUUID().toString();
				return str.substring(0, 8) + str.substring(9, 13) + str.substring(14, 18) + str.substring(19, 23) + str.substring(24);
			}
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
