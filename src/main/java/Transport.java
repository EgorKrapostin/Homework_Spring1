public abstract class Transport {

    private String model;

    public Transport(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "model='" + model + '\'' +
                '}';
    }
}
