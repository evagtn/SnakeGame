package timer;

public class GameTimer {
	static long startTime = System.nanoTime();

	public static String getTime() {
		String time = "";
		long timeNow = System.nanoTime();
		long x = (timeNow - startTime) / 1_000_000_000;
		long seconds = x % 60;
		long minutes = (x - seconds) / 60 % 60;

		if (minutes < 10) {
			time += 0;
		}
		time += minutes;
		time += ":";

		if (seconds < 10) {
			time += 0;
		}
		time += seconds;
		return time;

	}

	public static void resetTimer() {
		startTime = System.nanoTime();

	}

}
