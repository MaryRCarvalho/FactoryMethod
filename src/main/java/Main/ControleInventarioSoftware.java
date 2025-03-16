package Main;

public class ControleInventarioSoftware implements InventarioTec {

    @Override
    public String disponibilizar() {
        return "Software disponibilizado";
    }

    @Override
    public String desalocar() {
        return "Software desalocado";
    }

    @Override
    public String comprar() {
        return "Requisição de compra de software enviada";
    }

    @Override
    public String aposentar() {
        return "Notificação de aposentadoria de software enviada";
    }
}
