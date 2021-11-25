package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    // Переходим с 9 станции на 0
    @Test
    public void increaseNumStation() {   // создаём объект
        Radio next = new Radio();   //
        next.currentNumStation = 8;        //  обращение к переменной, задаём её
        next.increaseNumStation();  //  обращение к методу
        int expected = 9;           //  ожидаемый результат
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
    // Считаем на 1 станцию вниз
    public void decrease2NumStation() {   // создаём объект
        Radio prev2 = new Radio();   //
        prev2.currentNumStation = 8;        //  обращение к переменной, задаём её
        prev2.decrease2NumStation();  //  обращение к методу
        int expected = 7;           //  ожидаемый результат
        assertEquals(expected, prev2.currentNumStation);  //  сравнение ожидаемого,что у нас по факту в мето
    }

    @Test
    // Выставляем номер станции

    public void setCurrentNumStation ()

    {
        Radio num = new Radio();
        num.setCurrentNumStation(8);// устанавливаем вручную радиостанцию

        assertEquals(8, num.getCurrentNumStation());
    }

    @Test
    // Увеличиваем громкость на 1
    public void increaseCurrentVolume() {

        Radio plus = new Radio();
        plus.currentVolume = 8;
        plus.increaseVolume();
        int expected = 9;
        assertEquals(expected, plus.currentVolume);

    }

    @Test
    // // Уменьшение уровня громкости
    public void decreaseCurrentVolume() {

        Radio minus = new Radio();
        minus.currentVolume = 1;
        minus.decreaseVolume();
        int expected = 0;
        assertEquals(expected, minus.currentVolume);
    }
}


