package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControleInventarioHardwareTest {

    @Test
    void disponibilizar() {
        InventarioTec inventario = ControleInventarioFactory.obterControleInventario("ControleInventarioHardware");
        assertEquals("Hardware disponibilizado", inventario.disponibilizar());
    }

    @Test
    void desalocar() {
        InventarioTec inventario = ControleInventarioFactory.obterControleInventario("ControleInventarioHardware");
        assertEquals("Hardware desalocado", inventario.desalocar());
    }

    @Test
    void comprar() {
        InventarioTec inventario = ControleInventarioFactory.obterControleInventario("ControleInventarioHardware");
        assertEquals("Requisição de compra de hardware enviada", inventario.comprar());
    }

    @Test
    void aposentar() {
        InventarioTec inventario = ControleInventarioFactory.obterControleInventario("ControleInventarioHardware");
        assertEquals("Notificação de aposentadoria de hardware enviada", inventario.aposentar());
    }
}