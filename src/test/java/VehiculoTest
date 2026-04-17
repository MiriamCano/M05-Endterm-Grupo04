import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehiculoTest {

    @Test
    public void testConstructorYEstadoInicial() {
        Vehiculo coche = new Vehiculo("Toyota", "Corolla", 120);
        assertEquals("Toyota", coche.getMarca());
        assertEquals("Corolla", coche.getModelo());
        assertEquals(120, coche.getVelocidadMaxima());
        assertEquals(0, coche.getVelocidadActual(), "El coche debe estar parado al crearse");
    }

    @Test
    public void testAcelerarSumaVelocidad() {
        Vehiculo coche = new Vehiculo("Ford", "Focus", 200);
        coche.acelerar(50);
        assertEquals(50, coche.getVelocidadActual());
    }

    @Test
    public void testAcelerarNoSuperaVelocidadMaxima() {
        Vehiculo coche = new Vehiculo("Seat", "Ibiza", 100);
        coche.acelerar(150);
        assertEquals(100, coche.getVelocidadActual());
    }

    @Test
    public void testFrenarNoBajaDeCero() {
        Vehiculo coche = new Vehiculo("Renault", "Clio", 120);
        coche.acelerar(30);
        coche.frenar(50);
        assertEquals(0, coche.getVelocidadActual());
    }

    @Test
    public void testAcelerarNegativoLanzaExcepcion() {
        Vehiculo coche = new Vehiculo("Audi", "A3", 200);
        assertThrows(IllegalArgumentException.class, () -> {
            coche.acelerar(-20);
        });
    }
}