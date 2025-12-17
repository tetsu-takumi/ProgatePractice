package progate.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void testCarConstructorAndGetFuel() {
        Car car = new Car("フェラーリ", "赤");
        assertEquals("フェラーリ", car.getName(), "コンストラクタで名前が正しいか");
        assertEquals("赤", car.getColor(), "コンストラクタで色が正しいか");
        assertEquals(50, car.getFuel(), "初期燃料が正しいか");
        assertEquals(0, car.getDistance(), "初期走行距離は0か");
    }

    @Test
    void testGoWithEnoughFuel() {
        Car car = new Car("フェラーリ", "赤");
        car.setVelocity(30);   // 速度30km/h
        car.go(1);             // 1時間走行
        assertEquals(30, car.getX(), "位置が正しく更新されるか");
        assertEquals(20, car.getFuel(), "燃料が正しく減るか"); // 初期50 - 30 = 20
    }


    @Test
    void testGoWithNotEnoughFuel() {
        Car car = new Car("フェラーリ", "赤");
        car.setVelocity(30);   // 速度30km/h
        car.go(2);             // 2時間走行 → 距離 = 60km
        assertEquals(50, car.getX(), "燃料が足りない場合は燃料分だけ進むか");
        assertEquals(0, car.getFuel(), "燃料が0になっているか");
    }


    @Test
    void testCharge() {
        Car car = new Car("フェラーリ", "赤");
        car.charge(30);
        assertEquals(80, car.getFuel(), "燃料が正しく追加されるか");

        car.charge(50); // 満タンまで
        assertEquals(100, car.getFuel(), "燃料は100を超えないか");
    }

    @Test
    void testPrintData() {
        Car car = new Car("フェラーリ", "赤");
        // printData はコンソール出力なので例外が出ないことを確認
        assertDoesNotThrow(() -> car.printData());
    }
}
