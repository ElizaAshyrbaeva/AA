package classes;

public class Cast {


    private String acterFullName;
    private String role;

    public Cast(String acterFullName, String role) {
        this.acterFullName = acterFullName;
        this.role = role;
    }

    public String getActerFullName() {
        return acterFullName;
    }

    public void setActerFullName(String acterFullName) {
        this.acterFullName = acterFullName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "\nActor: " + acterFullName +
                "\nRole: " + role;
    }
    }

