package basic;

import cars.Bmw;
import org.junit.Assert;
import org.junit.Test;

public class TestCarApp {

    @Test
    public void testStartCar() {
        String expectedResult = "Car has started";
        String actualResult = Bmw.StartCar();
        Assert.assertEquals("Test Fail", expectedResult, actualResult);
    }

    @Test
    public void testAccelerateCar() {
        String expectedResult = "Car accelerates";
        String actualResult = Bmw.AccelerateCar();
        Assert.assertEquals("Test Fail", expectedResult, actualResult);
    }

    @Test
    public void testRadioOn() {
        String expectedResult = "Car radio turned on";
        String actualResult = Bmw.RadioOn();
        Assert.assertEquals("Test Fail", expectedResult, actualResult);
    }

}
