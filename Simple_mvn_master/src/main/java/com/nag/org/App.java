package com.nag.org;
import org.apache.log4j.Logger;
import org.joda.time.LocalDate;

public class App {

	private static final Logger logger = Logger.getLogger(App.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getLocalCurrentDate());

	}
	private static String getLocalCurrentDate() {

		if (logger.isDebugEnabled()) {
			logger.debug("getLocalCurrentDate() is executed!");
		}

		LocalDate date = new LocalDate();
		return date.toString();

	}

}
