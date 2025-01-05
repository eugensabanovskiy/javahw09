public class Radio {

    private int maxStation;
    private int minStation;
    private int currentStation = minStation;

    public Radio (){
        this.maxStation = 9;
        this.minStation = 0;
    }

    public Radio (int stationCount){
        this.maxStation = stationCount - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }
    public void increaseStation() {
        if (currentStation != maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
    }
    public void decreaseStation() {
        if (currentStation != minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 0;
        }
    }
    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 100;
        }

    }
}