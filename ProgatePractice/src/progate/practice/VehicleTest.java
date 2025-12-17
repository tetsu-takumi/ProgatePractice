package progate.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VehicleTest {

    @Test
    void testGo() {
        Vehicle vehicle = new Vehicle("フェラーリ", "赤");
        vehicle.setVelocity(60);
        vehicle.go(2); // 2時間走行
        assertEquals(120, vehicle.getX(), "go メソッドで正しく進むか");
    }

    @Test
    void testBack() {
        Vehicle vehicle = new Vehicle("フェラーリ", "赤");
        vehicle.setVelocity(50);
        vehicle.go(3);   // x = 150
        vehicle.back(2); // x = 50
        assertEquals(50, vehicle.getX(), "back メソッドで正しく戻るか");
    }

    @Test
    void testDiff() {
        Vehicle v1 = new Vehicle("Car1", "赤");
        Vehicle v2 = new Vehicle("Bike1", "青");
        v1.setX(100);
        v2.setX(30);
        assertEquals(70, Vehicle.diff(v1, v2), "diff メソッドで正しく差が出るか");
    }

    @Test
    void testGetSetX() {
        Vehicle vehicle = new Vehicle("フェラーリ", "赤");
        vehicle.setX(200);
        assertEquals(200, vehicle.getX(), "getX/setX が正しく動くか");
    }

    @Test
    void testVelocity() {
        Vehicle vehicle = new Vehicle("フェラーリ", "赤");
        vehicle.setVelocity(80);
        assertEquals(80, vehicle.getVelocity(), "getVelocity/setVelocity が正しく動くか");
    }

    @Test
    void testGetNameAndColor() {
        Vehicle vehicle = new Vehicle("フェラーリ", "赤");
        assertEquals("フェラーリ", vehicle.getName(), "getName が正しいか");
        assertEquals("赤", vehicle.getColor(), "getColor が正しいか");
    }

    @Test
    void testOwner() {
        Vehicle vehicle = new Vehicle("フェラーリ", "赤");
        Person person = new Person("Kate", "Jones", 27, 1.6, 50.0);
        vehicle.setOwner(person);
        assertEquals(person, vehicle.getOwner(), "getOwner/setOwner が正しいか");
    }

    @Test
    void testPrintData() {
        Vehicle vehicle = new Vehicle("フェラーリ", "赤");
        // printData はコンソール出力なので、実際に値を確認するのは難しい
        // ここでは実行時にエラーが出ないことを確認する
        assertDoesNotThrow(() -> vehicle.printData());
    }
}
