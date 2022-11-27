package ch04_di;

class Game {

    private final Player player;

    Game(Player player) {
        this.player = player;
    }

    public void run() {
        System.out.println(player);
    }
}
