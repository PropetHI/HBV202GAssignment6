package is.hi.hbv202g.ass6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    @Test
    public void getNameOfCar() {
        Car car=new Car("Beetle");
        CarOwner carOwner = new CarOwner("John Doe", car);
        assertEquals("Beetle", carOwner.theOwnedCar.getNameOfCar());
    }

}
