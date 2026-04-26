public class City {
    private final String name;
    private int safetyScore;
    private int publicTrust;

    public City(String name, int safetyScore, int publicTrust) {
        this.name = name;
        this.safetyScore = safetyScore;
        this.publicTrust = publicTrust;
    }

    public String getName() {
        return name;
    }

    public int getSafetyScore() {
        return safetyScore;
    }

    public int getPublicTrust() {
        return publicTrust;
    }

    public void adjustSafety(int delta) {
        safetyScore = clamp(safetyScore + delta);
    }

    public void adjustTrust(int delta) {
        publicTrust = clamp(publicTrust + delta);
    }

    private int clamp(int value) {
        if (value < 0) {
            return 0;
        }
        if (value > 100) {
            return 100;
        }
        return value;
    }
}
