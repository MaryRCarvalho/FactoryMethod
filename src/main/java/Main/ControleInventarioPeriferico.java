package Main;

public class ControleInventarioPeriferico implements InventarioTec{
    @Override
    public String disponibilizar() {
        return "Periférico disponibilizado";
    }

    @Override
    public String desalocar() {
        return "Periférico desalocado";
    }

    @Override
    public String comprar() {
        return "Requisição de compra de periférico enviada";
    }

    @Override
    public String aposentar() {
        return "Notificação de aposentadoria de periférico enviada";
    }
}
