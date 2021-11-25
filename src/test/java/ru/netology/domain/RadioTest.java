package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    // Переходим с 9 станции на 0
    @Test
    public void increaseNumStation() {   // создаём объект
        Radio next = new Radio();   //
        next.currentNumStation = 9;        //  обращение к переменной, задаём её
        next.increaseNumStation();  //  обращение к методу
        int expected = 0;           //  ожидаемый результат
        assertEquals(expected, next.currentNumStation);  //  сравнение ожидаемого,что у нас по факту в методе
    }

    @Test
    // Переходим с 0 на 9
    public void decreaseNumStation() {
        Radio prev = new Radio();
        prev.currentNumStation = 0;
        prev.decreaseNumStation();
        int expected = 9;
        assertEquals(expected, prev.currentNumStation);

    }

    @Test
    // Выставляем номер станции

    public void setCurrentNumStation() {
        Radio num = new Radio();
        num.setCurrentNumStation(8);// устанавливаем вручную радиостанцию
        assertEquals(8, num.getCurrentNumStation());
    }

    @Test
    // Увеличиваем громкость на 1
    public void increaseCurrentVolume() {

        Radio plus = new Radio();
        plus.currentVolume = 10;
        plus.increaseVolume();
        int expected = 10;
        assertEquals(expected, plus.currentVolume);

    }

    @Test
    // // Уменьшение уровня громкости
    public void decreaseCurrentVolume() {

        Radio minus = new Radio();
        minus.currentVolume = 5;
        minus.decreaseVolume();
        int expected = 4;
        assertEquals(expected, minus.currentVolume);
    }
}



/*
    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        // здесь уверены, что все проверки прошли
        this.currentTemperature = currentTemperature;
    }

//    public void setCurrentTemperature(int currentTemperature) {
//        if (currentTemperature <= maxTemperature) {
//            if (currentTemperature >= minTemperature) {
//                this.currentTemperature = currentTemperature;
//            }
//        }
//    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}*/
