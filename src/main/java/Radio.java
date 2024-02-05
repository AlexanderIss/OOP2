public class Radio {
    private int currentVolume;
    private int radioStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getRadioStation() {
        return radioStation;
    }


    public void setRadioStation(int newRadioStation) {
        if (newRadioStation < 10) {
            if (newRadioStation >= 0) {
                radioStation = newRadioStation;
            }
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 100) {
            if (newCurrentVolume >= 0) {
                currentVolume = newCurrentVolume;
            }
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void next() {
        if (radioStation < 9) {
            radioStation = radioStation + 1;
        } else {
            if (radioStation == 9) {
                radioStation = 0;
            }
        }
    }

    public void prev() {
        if (radioStation > 0) {
            radioStation = radioStation - 1;
        } else {
            if (radioStation == 0) {
                radioStation = 9;
            }
        }
    }
}
