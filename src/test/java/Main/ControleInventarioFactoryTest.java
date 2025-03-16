package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControleInventarioFactoryTest {

    @Test
    void deveRetornarExcecaoParaInventarioInexistente() {
        try {
            InventarioTec inventario = ControleInventarioFactory.obterControleInventario("ControleInventarioInsumo");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço de controle inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaInventarioInvalido() {
        try {
            InventarioTec inventario = ControleInventarioFactory.obterControleInventario("ControleInventarioMobilia");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço de controle inválido", e.getMessage());
        }
    }
}