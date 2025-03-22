package testNgListeners;

import java.time.LocalDateTime;

public class ToUnderstandDateTime {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		String timeStamp = ldt.toString();
		System.out.println(timeStamp);
		
		String newTimeStamp = timeStamp.replaceAll(":", "-");
		System.out.println(newTimeStamp);

	}

}
