package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControleInventarioMobiliaTest {

    @Test
    void disponibilizar() {
        ControleInventarioMobilia inventario = new ControleInventarioMobilia();
        assertEquals("Mobília disponibilizado", inventario.disponibilizar());
    }

    @Test
    void desalocar() {
        ControleInventarioMobilia inventario = new ControleInventarioMobilia();
        assertEquals("Mobília desalocado", inventario.desalocar());
    }

    @Test
    void comprar() {
        ControleInventarioMobilia inventario = new ControleInventarioMobilia();
        assertEquals("Requisição de compra de mobília enviada", inventario.comprar());
    }

    @Test
    void aposentar() {
        ControleInventarioMobilia inventario = new ControleInventarioMobilia();
        assertEquals("Notificação de aposentadoria de mobília enviada", inventario.aposentar());
    }
}