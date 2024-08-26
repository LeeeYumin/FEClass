package am;

public class Taxi implements Meter {

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	@Override
	public int stop(int distance) {
		//int result = distance * 2;
		return distance * 2;
	}

}
