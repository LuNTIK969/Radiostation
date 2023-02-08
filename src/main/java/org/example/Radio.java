package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int minStation = 0;
    private int minVolume = 0;
    private int stationsAmount = 10;
    private int maxStation = 9;
    private int maxVolume = 100;
    private int currentStation;
    private int currentVolume = maxVolume;


    public Radio(int stationsAmount) {
        maxStation = stationsAmount - 1;
    }

    public void increaseVolumeOneStep() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else
            currentVolume = maxVolume;
    }

    public void decreaseVolumeOneStep() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else
            currentVolume = 0;
    }

    public void mute() {
        currentVolume = minVolume;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else
            currentStation = 0;
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else
            currentStation = maxStation;
    }
}