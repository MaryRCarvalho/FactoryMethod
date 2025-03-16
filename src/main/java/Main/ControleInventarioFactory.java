package Main;

public class ControleInventarioFactory {

    public static InventarioTec obterControleInventario(String controleInventario) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Main." + controleInventario);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço de controle inexistente");
        }
        if (!(objeto instanceof InventarioTec)) {
            throw new IllegalArgumentException("Serviço de controle inválido");
        }
        return (InventarioTec) objeto;
    }
}
