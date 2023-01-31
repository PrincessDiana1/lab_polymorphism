import org.example.IceCreamCake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class IceCreamCakeTest {

    IceCreamCake iceCreamCake;

    @BeforeEach
    void setUp(){
        iceCreamCake = new IceCreamCake("Chocolate");
    }

    @Test
    void base(){
        assertThat(iceCreamCake.baseTexture()).isEqualTo("hard");
    }
}
