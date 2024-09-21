// Интерфейс для описания поведения рынка
public interface MarketBehaviour{
    void acceptToMarket(Actor actor);
    void releaseFromMarket(Actor actor);
    void update();
}
