package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControleInventarioPerifericoTest {

    @Test
    void disponibilizar() {
        InventarioTec inventario = ControleInventarioFactory.obterControleInventario("ControleInventarioPeriferico");
        assertEquals("Periférico disponibilizado", inventario.disponibilizar());
    }

    @Test
    void desalocar() {
        InventarioTec inventario = ControleInventarioFactory.obterControleInventario("ControleInventarioPeriferico");
        assertEquals("Periférico desalocado", inventario.desalocar());
    }

    @Test
    void comprar() {
        InventarioTec inventario = ControleInventarioFactory.obterControleInventario("ControleInventarioPeriferico");
        assertEquals("Requisição de compra de periférico enviada", inventario.comprar());
    }

    @Test
    void aposentar() {
        InventarioTec inventario = ControleInventarioFactory.obterControleInventario("ControleInventarioPeriferico");
        assertEquals("Notificação de aposentadoria de periférico enviada", inventario.aposentar());
    }
}