// Интерфейс QueueBehaviour
interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void releaseFromQueue();
    Actor serveNext();
}
