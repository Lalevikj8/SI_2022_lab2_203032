import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SILab2Test {
    @Test
    void exceptionTesting(){
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(Collections.emptyList()));
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(Arrays.asList("&","kikche" ,"#")));
        assertEquals(Arrays.asList("1", "#", "2", "0", "3", "#", "1", "#", "#"), SILab2.function(Arrays.asList("0", "#", "0", "0", "0", "#", "0", "#", "#")));
    }
    @Test
    void exceptionTesting2(){
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(Collections.emptyList()));
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(Arrays.asList("&","kikche" ,"#")));
        assertEquals(Arrays.asList("1", "#", "2", "0", "3", "#", "1", "#", "#"), SILab2.function(Arrays.asList("0", "#", "0", "0", "0", "#", "0", "#", "#")));
    }
}
