// Класс Human, реализующий интерфейс Actor
class Human implements Actor {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
