// Интерфейс для описания поведения актера
public interface ActorBehaviour{
    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean takeOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
}
