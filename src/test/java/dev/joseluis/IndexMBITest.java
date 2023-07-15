package dev.joseluis;

import org.junit.jupiter.api.Test;

public class IndexMBITest {
    @Test
    void testCalculateMBI() {
        int weight = 87;
        double height = 1.74;
        IndexMBI indexMBI = new IndexMBI(weight,height);
    }
}
