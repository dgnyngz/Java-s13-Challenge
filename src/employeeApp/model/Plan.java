package employeeApp.model;

public enum Plan {
    BASIC("BASIC",1000),
    NORMAL("NORMAL",2000),
    ADVANCE("ADVANCE",3000);
    private String name;
    private int price;
    Plan(String name,int price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
