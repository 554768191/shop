package wl.tools;

import java.util.Properties;

public class BaseInfo {
	private static Properties properties = new Properties();
	
	static{
		try {
			properties.load(BaseInfo.class.getClassLoader().getResourceAsStream("info.properties"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static String getInfo(String key){
		return (String)properties.get(key);
	}

//	如何获取值
//	public static void main(String[] args) {
//		System.out.println(getInfo("B_PAGE_COUNT"));
//	}
}
