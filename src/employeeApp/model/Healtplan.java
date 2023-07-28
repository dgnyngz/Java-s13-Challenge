package employeeApp.model;

public class Healtplan {
    private int id;
    private String name;
    private Plan plan;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public  Healtplan(int id,String name , Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Plan getPlan() {
        return plan;
    }

    @Override
    public String toString() {
        return "Healtplan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", plan=" + plan +
                '}';
    }
}

