package ru.netology.domain;


public class Radio {
    String name;

    int currentVolume;
    int currentNumStation;


    // Список станций вверх, Переходим с 9 станции на 0,
    public void increaseNumStation() {

        if (currentNumStation < 9) {
            currentNumStation = currentNumStation + 1;
        } else currentNumStation = 0;

    }

    // Список станций вниз, переходим с 0 на 9
    public void decreaseNumStation() {
        if (currentNumStation > 0) {
            currentNumStation = currentNumStation - 1;
        }
        if (currentNumStation <= 0) {
            currentNumStation = 9;
        }
    }


    //  Увеличение уровень громкости, Увеличение громкости больше  9 не идёт
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }
    }

    //Выставляем номер станции
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

    public int getCurrentNumStation() {
        return currentNumStation;
    }

    // Уменьшение уровня громкости, Уменьшение громкости ниже  0 не идёт
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
    }
}





