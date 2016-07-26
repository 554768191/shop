package wl.tools;

import java.util.Calendar;

public class GetCode {
	public static long getCode() {
		Calendar calendar = Calendar.getInstance();
		long code= calendar.getTime().getTime();
		return code;
	}
}
