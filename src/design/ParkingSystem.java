package design;

public class ParkingSystem {
	int big, medium, small, i, j, k;

	public ParkingSystem(int big, int medium, int small) {
		this.big = big;
		this.medium = medium;
		this.small = small;
	}

	public boolean addCar(int carType) {
		switch (carType) {
		case 1: {
			if (i++ >= big)
				return false;
			break;
		}
		case 2: {
			if (j++ >= medium)
				return false;
			break;
		}
		case 3: {
			if (k++ >= small)
				return false;
			break;
		}
		}
		return true;
	}
}
