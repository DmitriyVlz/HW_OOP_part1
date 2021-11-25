package ru.netology.domain;


public class Radio {
    String name;

    int currentVolume;
    int currentNumStation;


    // Переходим с 9 станции на 0
    public void increaseNumStation() {

        if (currentNumStation < 9) {
            currentNumStation = currentNumStation + 1;
        } else currentNumStation = 0;
    }

    // Переходим с 0 на 9
    public void decreaseNumStation() {
        if (currentNumStation <= 0) {
            currentNumStation = 9;
        }
    }

    // Выставляем номер станции
    public int getCurrentNumStation() {
        return currentNumStation;
    }

    public void setCurrentNumStation(int currentNumStation) {

        if (currentNumStation > 9) { // проверяем диапазон, если больше, то выходим, если нет, то идём на след IF
            return;
        }
        if (currentNumStation < 0) {  //
            return;
        }
        // здесь уверены, что все проверки прошли
        this.currentNumStation = currentNumStation;
    }

    //  Увеличение уровень громкости
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    // Уменьшение уровня громкости
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;

        }
    }
}

// public void increaseVolume(){

//      if (volumeSound < 9) {
//        volumeSound = volumeSound + 1;
//     }
//      else volumeSound = 0;
// }