package progate.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void testMain() {
        assertDoesNotThrow(() -> {
            String[] args = {};
            Main.main(args); // mainメソッドを呼び出す
        }, "main メソッドが例外なく実行できるか");
    }
}
