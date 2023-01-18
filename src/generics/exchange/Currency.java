package generics.exchange;

public class Currency {

    private String name;
    private float value;

    protected Currency(String name, float value) {
        this.name = name;
        this.value=value;
    }

    public float getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
