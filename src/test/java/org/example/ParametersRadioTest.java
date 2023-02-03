package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParametersRadioTest {

    @Test
    public void shouldSetStation() {
        Radio rad = new Radio(1_000);
        rad.setCurrentStation(568);

        int expected = 568;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

}