package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    public static final String BEETLE = "Beetle";
    public static final String JOHN_DOE = "John Doe";
    private Car car;
    private CarOwner carOwner;

    @Before
    public void initTest(){
        car = new Car(BEETLE);
        carOwner = new CarOwner(JOHN_DOE, car);
    }

    @Test
    public void getNameOfCar() {
        assertEquals(BEETLE, carOwner.getCarName());
    }

}
