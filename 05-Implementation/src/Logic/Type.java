package Logic;

public enum Type {
    NORMAL(1),
    WATER(2),
    GROUND(3),
    ELECTRIC(4),
    GRASS(5),
    FLYING(6),
    POISON(7),
    FIGHTING(8),
    ROCK(9),
    BUG(10),
    GHOST(11),
    FIRE(12),
    ICE(13),
    PSYCHIC(14),
    DRAGON(15);

    private int value;

    Type(int value) {
        this.value = value;
    }

}
