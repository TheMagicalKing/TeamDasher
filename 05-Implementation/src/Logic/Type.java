package Logic;

public enum Type {
    NORMAL(0),
    WATER(1),
    GROUND(2),
    ELECTRIC(3),
    GRASS(4),
    FLYING(5),
    POISON(6),
    FIGHTING(7),
    ROCK(8),
    BUG(9),
    GHOST(10),
    FIRE(11),
    ICE(12),
    PSYCHIC(13),
    DRAGON(14);

    private int value;

    Type(int value) {
        this.value = value;
    }

}
