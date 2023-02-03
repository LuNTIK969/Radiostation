package org.example;

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int maxStation;
    private int maxVolume;

    public Radio(int stationsAmount) {
        maxStation = stationsAmount - 1;
    }

    public Radio() {
        maxStation = 9;
        maxVolume = 100;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            setMaxVolume();
            return;
        }

        currentVolume = newCurrentVolume;
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

    public void setMaxVolume() {
        currentVolume = maxVolume;
    }

    public void mute() {
        currentVolume = 0;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }

        currentStation = newCurrentStation;
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