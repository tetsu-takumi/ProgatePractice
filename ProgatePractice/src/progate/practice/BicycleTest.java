package progate.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BicycleTest {

    @Test
    void testGo() {
        Bicycle bike = new Bicycle("ビアンキ", "青");
        bike.setVelocity(20);
        bike.go(3); // 3時間走行
        assertEquals(60, bike.getX(), "go メソッドで正しく進むか");
    }

    @Test
    void testBack() {
        Bicycle bike = new Bicycle("ビアンキ", "青");
        bike.setVelocity(15);
        bike.go(4);   // x = 60
        bike.back(2); // x = 30
        assertEquals(30, bike.getX(), "back メソッドで正しく戻るか");
    }

    @Test
    void testBicycleConstructor() {
        Bicycle bike = new Bicycle("ビアンキ", "緑");
        assertEquals("ビアンキ", bike.getName(), "コンストラクタで名前が正しいか");
        assertEquals("緑", bike.getColor(), "コンストラクタで色が正しいか");
        assertEquals(0, bike.getX(), "初期の現在地は0か");
        assertEquals(0, bike.getVelocity(), "初期の速度は0か");
    }
}
