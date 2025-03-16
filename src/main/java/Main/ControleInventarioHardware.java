package Main;

public class ControleInventarioHardware implements InventarioTec{
    @Override
    public String disponibilizar() {
        return "Hardware disponibilizado";
    }

    @Override
    public String desalocar() {
        return "Hardware desalocado";
    }

    @Override
    public String comprar() {
        return "Requisição de compra de hardware enviada";
    }

    @Override
    public String aposentar() {
        return "Notificação de aposentadoria de hardware enviada";
    }
}
