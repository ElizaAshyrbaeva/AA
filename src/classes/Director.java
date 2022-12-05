package classes;

public class Director {
    private String fullName;

    public Director(String fullName) {
        this.fullName = fullName;
    }

    public String getName() {
        return fullName;
    }

    public void setFullName(String name) {
        this.fullName = name;
    }

    @Override
    public String toString() {
        return fullName;
    }
}
