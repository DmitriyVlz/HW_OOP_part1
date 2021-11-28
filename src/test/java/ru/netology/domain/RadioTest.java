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
    // Считаем на 1 станцию вверх
    public void increase2NumStation() {   // создаём объект
        Radio next2 = new Radio();   //
        next2.currentNumStation = 7;        //  обращение к переменной, задаём её
        next2.increaseNumStation();  //  обращение к методу
        int expected = 8;           //  ожидаемый результат
        assertEquals(expected, next2.currentNumStation);  //  сравнение ожидаемого,что у нас по факту в мето
    }

    @Test
    // Переходим с 0 на 9
    public void decrease1NumStation() {
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
        prev2.decreaseNumStation();  //  обращение к методу
        int expected = 7;           //  ожидаемый результат
        assertEquals(expected, prev2.currentNumStation);  //  сравнение ожидаемого,что у нас по факту в мето
    }

    @Test
    // Номер станции меньше 0
    public void decreaseNumStation() {   // создаём объект
        Radio prev3 = new Radio();   //
        prev3.currentNumStation = -1;        //  обращение к переменной, задаём её
        prev3.decreaseNumStation();  //  обращение к методу
        int expected = 9;           //  ожидаемый результат
        assertEquals(expected, prev3.currentNumStation);  //  сравнение ожидаемого,что у нас по факту в мето
    }

    @Test
    // Номер станции больше 9
    public void increase3NumStation() {   // создаём объект
        Radio next3 = new Radio();   //
        next3.currentNumStation = 10;        //  обращение к переменной, задаём её
        next3.increaseNumStation();  //  обращение к методу
        int expected = 0;           //  ожидаемый результат
        assertEquals(expected, next3.currentNumStation);  //  сравнение ожидаемого,что у нас по факту в мето
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
    //  Увеличеие громкости больше 10 не идёт
    public void increase2CurrentVolume() {

        Radio plus2 = new Radio();
        plus2.currentVolume = 11;
        plus2.increaseVolume();
        int expected = 10;
        assertEquals(expected, plus2.currentVolume);
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

    @Test
    //  Уменьшение громкости ниже  0 не идёт
    public void decrease2CurrentVolume() {

        Radio minus2 = new Radio();
        minus2.currentVolume = -1;
        minus2.decreaseVolume();
        int expected = 0;
        assertEquals(expected, minus2.currentVolume);
    }

    @Test
    //Выставляем номер станции в диапазоне

    public void setcurrentNumStation() {
        Radio num = new Radio();
        num.setCurrentNumStation(8);// устанавливаем вручную радиостанцию

        assertEquals(8, num.getCurrentNumStation());
    }

    @Test
    //Выставляем номер станции выше диапазона
    public void setcurrentUpNumStation() {
        Radio num = new Radio();
        num.setCurrentNumStation(10);// устанавливаем вручную радиостанцию

        assertEquals(0, num.getCurrentNumStation());
    }

    @Test
    //Выставляем номер станции ниже диапазона
    public void setcurrentDounNumStation() {
        Radio num = new Radio();
        num.setCurrentNumStation(-1);// устанавливаем вручную радиостанцию

        assertEquals(0, num.getCurrentNumStation());
    }
}


