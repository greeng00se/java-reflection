package ch04_di;

class Player {
    private final int age;

    public Player() {
        this.age = 30;
    }

    @Override
    public String toString() {
        return "Player{" +
                "age=" + age +
                '}';
    }
}
