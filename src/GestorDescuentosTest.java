import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestorDescuentosTest {

    static GestorDescuentos g;

    @BeforeAll
    static void setup(){
        g = new GestorDescuentos();
    }

    @Test
    void adulto_SinDescuento() {


        //ACT
        double res = g.calcular(500,45, 1);

        //Assert
        assertEquals(500, res);

    }

    @Test
    @DisplayName("señor de 65 años tiene 50% descuento")
    void senior65_Descuento50(){

        //ACT
        double res = g.calcular(100,65, 1);

        assertEquals(50, res);

    }

    @Test
    void cantidad5_SinBonusExtra() {
        double res = g.calcular(10.0, 30, 5);
        assertEquals(50, res);
    }

    @Test
    void precioNegativo_LanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
                        g.calcular(-50, 30, 1);
        });
    }
}