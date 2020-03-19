package students.assignments.marina;

public class MiniCar {

	// Our mini car should comes with 50 liters of gas
	// We should be able to drive that car but we need to tell it how many miles we
	// want to driver
	// Car can drive and should be able to tell us, how many miles it has driven
	// For 1 liter of gas that car can drive 10 miles, now we should be able to
	// drive as many time we want but as long as the car has gas

	private int fuelCapacity = 50;
	private int mileage = 0;

	public void fuelCapacity() {
		System.out.println("MiniCar's fuel capacity is " + fuelCapacity + "liters");
	}

	public void mileage() {
		System.out.println(" mileage " + mileage);
	}

	public void drive(int mile) {
		//At first check car has enough fuel in order to drive the given mile
		if((mile / 10) <= fuelCapacity) {
			// yes, given car can drive given mile
			System.out.println("Driven " + mile + "  mile ");
			
			//now that car driven, less minus the fuel and add milage
			mileage = mileage + mile;
			fuelCapacity = fuelCapacity - (mile / 10);
		}else {
			System.out.println("Unsufficent fuel to drive "+ mile +" mile. Either fill gas or drive less mile");
		}
		
		
	}
}