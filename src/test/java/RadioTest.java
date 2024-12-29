import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.increaseStation();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(4);
        radio.decreaseStation();

        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetOverMaxStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetOverMinStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetZeroStationAfterNine() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.increaseStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNineStationAfterZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.decreaseStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void getCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.decreaseVolume();

        int expected = 49;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetOverMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetOverMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetZeroVolumeAfterOneHundred() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetOneHundredVolumeAfterZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void getCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(16);

        int expected = 16;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
