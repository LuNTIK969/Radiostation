package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParametersRadioTest {

    @Test
    public void checkNewForMaxPer() {
        Radio rad = new Radio();
        rad.setStationsAmount(10);
        rad.setMaxStation(9);
        rad.setMinStation(0);
        rad.setMaxVolume(100);

        Assertions.assertEquals(10, rad.getStationsAmount());
        Assertions.assertEquals(9, rad.getMaxStation());
        Assertions.assertEquals(0, rad.getMinStation());
        Assertions.assertEquals(0 , rad.getMinVolume());
        Assertions.assertEquals(100 , rad.getMaxVolume());
    }

    @Test
    public void shouldSetStation() {
        Radio rad = new Radio(1_000);
        rad.setCurrentStation(555);

        int expected = 555;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

}