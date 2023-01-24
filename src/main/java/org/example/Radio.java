package org.example;

public class Radio {
    private int currentVolume;
    private int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            setMaxVolume();
            return;
        }

        currentVolume = newCurrentVolume;
    }

    public void increaseVolumeOneStep() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else
            currentVolume = 10;
    }

    public void decreaseVolumeOneStep() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else
            currentVolume = 0;
    }

    public void setMaxVolume() {
        currentVolume = 10;
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
        if (newCurrentStation > 9) {
            return;
        }

        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else
            currentStation = 0;
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else
            currentStation = 9;
    }

}


