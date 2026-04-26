public class Incident {
    private final IncidentType type;
    private final City city;
    private final int severity;
    private final int urgency;

    public Incident(IncidentType type, City city, int severity, int urgency) {
        this.type = type;
        this.city = city;
        this.severity = severity;
        this.urgency = urgency;
    }

    public IncidentType getType() {
        return type;
    }

    public City getCity() {
        return city;
    }

    public int getSeverity() {
        return severity;
    }

    public int getUrgency() {
        return urgency;
    }

    public int getDifficultyScore() {
        return (severity * 3) + (urgency * 2);
    }
}
