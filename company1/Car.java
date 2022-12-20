package interview1.company1;

public class Car {
	String carModel = "xcent";

	public void driveCar() {
		String driverName = "Hari";
		System.out.println("first method - drive car");
		carModel = "i10";
		System.out.println(carModel);
		System.out.println(driverName);//local variable	use only in particular method
	//we cannot use local variables in other methods	
	}
	
	public void applyBrakes() {
		
		System.out.println("applied brake");
		System.out.println(carModel);
	}
	
	public static void main(String[] args) {
		
		byte seatingCapacity = 5;
		int carPrimce = 800000;
		long ownerMobile = 9003500994L;
		
		float milage = 20.25F;
		double distanceRan = 432343.34343;
		
		char fuelType = 'p';
		
		boolean preOwned = false;
		
		Car myCar = new Car();
		
		myCar.driveCar();
		myCar.applyBrakes();	
		
		System.out.println(myCar.carModel);
		System.out.println(seatingCapacity);
		System.out.println(carPrimce);
		System.out.println(ownerMobile);
		System.out.println(milage);
		System.out.println(distanceRan);
		System.out.println(fuelType);
		System.out.println(preOwned);
	
	}
	
}


