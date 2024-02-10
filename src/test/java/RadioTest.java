import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {
    @Test
    void increaseVolumeMoreMax() { // повышаем звук выше верхней границы по звуку
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeValid() { // повышаем звук
        Radio volume = new Radio();
        volume.setCurrentVolume(50);
        volume.increaseVolume();
        int expected = 51;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reduceVolumeLessMin() { // понижаем звук  ниже границы по звуку
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.reduceVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reduceVolumeValid() { // понижаем звук
        Radio volume = new Radio();
        volume.setCurrentVolume(50);
        volume.reduceVolume();
        int expected = 49;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextMoreMax() { // повышаем частоту выше верхней границы
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextValid() { // повышаем частоту
        Radio radio = new Radio();
        radio.setRadioStation(5);
        radio.next();
        int expected = 6;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevLessMin() { // понижаем частоту ниже нижней границы
        Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevValid() { // понижаем частоту
        Radio radio = new Radio();
        radio.setRadioStation(5);
        radio.prev();
        int expected = 4;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setVolumeMoreMaxNoValid() { // невалидное значение звука выше границы
        Radio volume = new Radio();
        volume.setCurrentVolume(50);
        volume.setCurrentVolume(101);
        int expected = 50;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setVolumeLessMinNoValid() { // невалидное значение звука ниже границы
        Radio volume = new Radio();
        volume.setCurrentVolume(50);
        volume.setCurrentVolume(-1);
        int expected = 50;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setVolumeValid() { // выбрать валидное значение
        Radio volume = new Radio();
        volume.setCurrentVolume(50);
        int expected = 50;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setRadioMinNoValid() { // невалидное значение частоты ниже границы
        Radio radio = new Radio();
        radio.setRadioStation(5);
        radio.setRadioStation(-5);
        int expected = 5;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setRadioMaxNoValid() { // невалидное значение частоты выше границы
        Radio radio = new Radio();
        radio.setRadioStation(5);
        radio.setRadioStation(11);
        int expected = 5;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setRadioValid() { // выбрать валижное значение частоты
        Radio radio = new Radio();
        radio.setRadioStation(5);
        int expected = 5;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void prevNoValid() { // проверяем не валидное значение
        Radio radio = new Radio();
        radio.setRadioStation(-1);
        radio.prev();
        int expected = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

        // --------------------------next: все варианты поля radioStation------------------------------------------
        @Test
        void next_1() { // проверяем не валидное значение
            Radio radio = new Radio();
            radio.setRadioStation(2);
            radio.setRadioStation(-1);
            radio.next();
            int expected = 3;
            int actual = radio.getRadioStation();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        void next0() { // проверяем не валидное значение
            Radio radio = new Radio();
            radio.setRadioStation(0);
            radio.next();
            int expected = 1;
            int actual = radio.getRadioStation();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        void next1() { // проверяем не валидное значение
            Radio radio = new Radio();
            radio.setRadioStation(1);
            radio.next();
            int expected = 2;
            int actual = radio.getRadioStation();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        void next2() { // проверяем не валидное значение
            Radio radio = new Radio();
            radio.setRadioStation(2);
            radio.next();
            int expected = 3;
            int actual = radio.getRadioStation();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        void next3() { // проверяем не валидное значение
            Radio radio = new Radio();
            radio.setRadioStation(3);
            radio.next();
            int expected = 4;
            int actual = radio.getRadioStation();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        void next4() { // проверяем не валидное значение
            Radio radio = new Radio();
            radio.setRadioStation(4);
            radio.next();
            int expected = 5;
            int actual = radio.getRadioStation();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        void next5() { // проверяем не валидное значение
            Radio radio = new Radio();
            radio.setRadioStation(5);
            radio.next();
            int expected = 6;
            int actual = radio.getRadioStation();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        void nextN6() { // проверяем не валидное значение
            Radio radio = new Radio();
            radio.setRadioStation(6);
            radio.next();
            int expected = 7;
            int actual = radio.getRadioStation();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        void next7() { // проверяем не валидное значение
            Radio radio = new Radio();
            radio.setRadioStation(7);
            radio.next();
            int expected = 8;
            int actual = radio.getRadioStation();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        void next8() { // проверяем не валидное значение
            Radio radio = new Radio();
            radio.setRadioStation(8);
            radio.next();
            int expected = 9;
            int actual = radio.getRadioStation();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        void next9() { // проверяем не валидное значение
            Radio radio = new Radio();
            radio.setRadioStation(9);
            radio.next();
            int expected = 0;
            int actual = radio.getRadioStation();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        void next10() { // проверяем не валидное значение
            Radio radio = new Radio();
            radio.setRadioStation(5);
            radio.setRadioStation(10);
            radio.next();
            int expected = 6;
            int actual = radio.getRadioStation();
            Assertions.assertEquals(expected, actual);
        }

    }









