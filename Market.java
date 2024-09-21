import java.util.LinkedList;
import java.util.Queue;

// Класс Market
class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<Actor> queue = new LinkedList<>();

    // Принимает актёра на рынок
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " пришёл на рынок.");
        takeInQueue(actor);
    }

    // Добавляет актёра в очередь
    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " добавлен в очередь.");
    }

    // Обслуживает следующего актёра в очереди
    @Override
    public Actor serveNext() {
        Actor actor = queue.poll();
        if (actor != null) {
            System.out.println(actor.getName() + " обслуживается.");
        }
        return actor;
    }

    // Выпускает актёра из очереди
    @Override
    public void releaseFromQueue() {
        Actor actor = serveNext();
        if (actor != null) {
            releaseFromMarket(actor);
        }
    }

    // Выпускает актёра с рынка
    @Override
    public void releaseFromMarket(Actor actor) {
        System.out.println(actor.getName() + " покинул рынок.");
    }

    // Обновляет состояние магазина: принимет и отдаёт заказы
    public void update() {
        if (!queue.isEmpty()) {
            releaseFromQueue();
        } else {
            System.out.println("Нет клиентов для обслуживания.");
        }
    }
}
