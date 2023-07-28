package dev.joseluis;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class IndexMBITest {

    @Test
    void testMBIHavenWeightAndHeight() {
      IndexMBI indexMBI = new IndexMBI(87, 1.74);
      
      int weight = indexMBI.getWeight();
      double height = indexMBI.getHeight();

      assertThat(weight, is(87));
      assertThat(height, is(1.74));
    }
    @Test
    void testCalculateMBI() {
        int weight = 87;
        double height = 1.74;
        IndexMBI indexMBI = new IndexMBI(weight,height);

        double result = indexMBI.calculateMBI();
        assertThat(result, is(28.73));
        

      }

}      
