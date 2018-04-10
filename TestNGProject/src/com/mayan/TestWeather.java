package com.mayan;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestWeather {
  @Parameters({"cityname"})  
  @Test
  public  void getWeather(String cityname) {
	 String  jsonResult=HttpUtil.request(cityname);
	 System.out.println("=========="+jsonResult);
  }
  
  @Parameters({"cityname1"})  
  @Test
  public  void getWeatherN(String cityname1) {
	 String  jsonResult=HttpUtil.request(cityname1);
	 System.out.println("=========="+jsonResult);
  }
  
//  @Test
//  public  void getWeather() {
//	 String  jsonResult=HttpUtil.request("南京");
//	 System.out.println("=========="+jsonResult);
//  }
//  
//  @Test
//  public  void getWeatherN() {
//	 String  jsonResult=HttpUtil.request("无锡");
//	// System.out.println("=========="+HttpUtil.unicode2String(jsonResult));
//	 System.out.println("=========="+jsonResult);
//  }
  
  
  
}
