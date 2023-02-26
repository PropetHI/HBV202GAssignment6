package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Car car;
    private CarOwner carOwner;

    @Before
    public void initTest(){
        car = new Car("Beetle");
        carOwner = new CarOwner("John Doe", car);
    }

    @Test
    public void getNameOfCar() {
        assertEquals("Beetle", carOwner.getCarName());
    }

}
