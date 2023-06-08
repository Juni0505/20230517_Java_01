package kh.lclass.api;

public class KhCommonApi {
	public boolean checkMenu(int start, int end, int value) {
		boolean result = false;
		if (value < start || value > end) {

		} else {
			result = true;
		}
		return result;
	}
}
