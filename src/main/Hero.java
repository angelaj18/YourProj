public class Hero {
    private final String name;
    private final int powerLevel;
    private int stressLevel;
    private boolean available;

    public Hero(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.stressLevel = 10;
        this.available = true;
    }

    public String getName() {
        return name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public int getStressLevel() {
        return stressLevel;
    }

    public boolean isAvailable() {
        return available;
    }

    public void dispatchToMission() {
        available = false;
        stressLevel = Math.min(100, stressLevel + 20);
    }

    public void recoverAfterTurn() {
        available = true;
        stressLevel = Math.max(0, stressLevel - 5);
    }
}
