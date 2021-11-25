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
    // Счётчик станций вверх


    // Переходим с 0 на 9
    public void decreaseNumStation() {
        if (currentNumStation == 0 ) {
            currentNumStation = 9;
                    } return ;
    }

    // Считаем на 1 станцию вниз
    public void decrease2NumStation(){
       if ( currentNumStation > 0 && currentNumStation < 10){
           currentNumStation = currentNumStation - 1 ;
           return;
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
        if (currentVolume > 0 && currentVolume  < 10) {
            currentVolume = currentVolume + 1;
            return;
        }

    }

    // Уменьшение уровня громкости
    public void decreaseVolume() {
        if (currentVolume > 0 && currentVolume < 10) {
            currentVolume = currentVolume - 1;
            return;
        }
        //else currentVolume = 0;
    }
}
