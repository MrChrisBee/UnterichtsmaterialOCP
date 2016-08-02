package wbs.localization;

import java.util.Date;
import java.util.GregorianCalendar;

public class LottoDatumUtilDemo {

	public static void main(String[] args) {
		Date heute =new Date();
		LottoDatumUtil lu = new LottoDatumUtil();
		lu.ersterZiehungstag(heute,true , true ,18, 19);
		
	}

}
