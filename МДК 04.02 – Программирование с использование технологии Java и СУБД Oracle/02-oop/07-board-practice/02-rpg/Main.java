class GameCharacter {
    private final String name;
    private int health;
    private final int attackPower;

    public GameCharacter(String name, int health, int attackPower) {
        if (name == null || name.isBlank() || health <= 0 || attackPower <= 0) {
            throw new IllegalArgumentException("Некорректные параметры персонажа");
        }
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    protected int getAttackPower() {
        return attackPower;
    }

    protected String getName() {
        return name;
    }

    public void attack(GameCharacter target) {
        if (!isAlive() || target == null || !target.isAlive()) {
            System.out.println("Атака невозможна");
            return;
        }
        System.out.printf("%s атакует %s: -%d HP%n", name, target.name, attackPower);
        target.takeDamage(attackPower);
    }

    public void takeDamage(int damage) {
        if (damage > 0) {
            health = Math.max(0, health - damage);
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void showStatus() {
        System.out.printf("%s: %d HP%n", name, health);
    }
}

class Warrior extends GameCharacter {
    public Warrior(String name) {
        super(name, 120, 20);
    }
}

class Mage extends GameCharacter {
    public Mage(String name) {
        super(name, 80, 15);
    }

    @Override
    public void attack(GameCharacter target) {
        if (!isAlive() || target == null || !target.isAlive()) {
            System.out.println("Атака невозможна");
            return;
        }
        int spellDamage = getAttackPower() * 2;
        System.out.printf("%s использует заклинание: -%d HP%n", getName(), spellDamage);
        target.takeDamage(spellDamage);
    }
}

public class Main {
    public static void main(String[] args) {
        GameCharacter warrior = new Warrior("Рыцарь");
        GameCharacter mage = new Mage("Маг");

        warrior.showStatus();
        mage.showStatus();
        warrior.attack(mage);
        mage.attack(warrior);

        System.out.println("--- Статус после атаки ---");
        GameCharacter[] team = {warrior, mage};
        for (GameCharacter character : team) {
            character.showStatus();
        }

        System.out.println("--- Полиморфизм в действии ---");
        GameCharacter enemy = new Warrior("Орк");
        for (GameCharacter character : team) {
            character.attack(enemy);
        }
        enemy.showStatus();
    }
}
