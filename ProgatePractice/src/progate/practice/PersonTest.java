package progate.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void testConstructorAndFullName() {
        Person p1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
        assertEquals("Kate Jones", p1.fullName(), "fullName が正しいか");
        assertEquals(27, p1.getAge(), "年齢が正しいか");
        assertEquals(1.6, p1.getHeight(), "身長が正しいか");
        assertEquals(50.0, p1.getWeight(), "体重が正しいか");
    }

    @Test
    void testBmi() {
        Person p = new Person("John", "Smith", 30, 1.8, 72.0);
        double expectedBmi = 72.0 / (1.8 * 1.8); // BMI = 体重(kg) ÷ (身長(m)²)
        assertEquals(expectedBmi, p.bmi(), 0.01, "BMI が正しく計算されるか");
    }

    @Test
    void testBuyVehicle() {
        Person p = new Person("Kate", "Jones", 27, 1.6, 50.0);
        Car car = new Car("フェラーリ", "赤");
        p.buy(car);
        assertEquals(p, car.getOwner(), "購入した車のオーナーが正しいか");

        Bicycle bike = new Bicycle("ビアンキ", "青");
        p.buy(bike);
        assertEquals(p, bike.getOwner(), "購入した自転車のオーナーが正しいか");
    }

    @Test
    void testPrintData() {
        Person p = new Person("Kate", "Jones", 27, 1.6, 50.0);
        // printData はコンソール出力なので、例外が出ないことを確認
        assertDoesNotThrow(() -> p.printData(), "printData が例外なく実行できるか");
    }
}
