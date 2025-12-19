import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class GestorEnviosTest {
    static GestorEnvios g;

    @BeforeAll
    static void setup(){
        g = new GestorEnvios();
    }


    @ParameterizedTest(name = "El pedido es de {0} y su coste sería {1}")
    @CsvSource({
            "10.0, 5.0", //pedido pequeño menos 20 euros
            "20.0, 3.0", //limite 20 euros
            "40.0, 3.0", //pedido mediano
            "49.0, 3.0", //límite 49 euros
            "50.0, 0.0"
    })
    void testingMasivo (double precio, double valorEsperado ){
        double res = g.calcular(precio);
        assertEquals(valorEsperado, res);
    }

    @Test
    void precioNegativo_LanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            g.calcular(-50);
        });
    }

}