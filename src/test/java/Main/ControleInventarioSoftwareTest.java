package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControleInventarioSoftwareTest {

    @Test
    void disponibilizar() {
        InventarioTec inventario = ControleInventarioFactory.obterControleInventario("ControleInventarioSoftware");
        assertEquals("Software disponibilizado", inventario.disponibilizar());
    }

    @Test
    void desalocar() {
        InventarioTec inventario = ControleInventarioFactory.obterControleInventario("ControleInventarioSoftware");
        assertEquals("Software desalocado", inventario.desalocar());
    }

    @Test
    void comprar() {
        InventarioTec inventario = ControleInventarioFactory.obterControleInventario("ControleInventarioSoftware");
        assertEquals("Requisição de compra de software enviada", inventario.comprar());
    }

    @Test
    void aposentar() {
        InventarioTec inventario = ControleInventarioFactory.obterControleInventario("ControleInventarioSoftware");
        assertEquals("Notificação de aposentadoria de software enviada", inventario.aposentar());
    }
}