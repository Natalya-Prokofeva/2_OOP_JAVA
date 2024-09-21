public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Actor human1 = new Human("Иван");
        Actor human2 = new Human("Мария");

        market.acceptToMarket(human1);
        market.acceptToMarket(human2);

        market.update(); // Обработка первого актёра
        market.update(); // Обработка второго актёра
        market.update(); // Обработка при отсутствии клиентов
    }
}
