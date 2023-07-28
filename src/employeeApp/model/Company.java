package employeeApp.model;

public class Company {
    private int id;
    private String name;
    private int giro;
    String[] developerNames;
    public  Company(int id,String name,int giro,String[] developerNames){
        this.id=id;
        this.name=name;
        if(giro<0){
            this.giro=0;

        }else{
            this.giro = giro;
        }
        this.developerNames=developerNames;

    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getGiro() {
        return giro;
    }


    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void setGiro(int giro) {
        if(giro<0){
            this.giro=0;

      }else{
            this.giro = giro;
        }

    }

    public void setName(String name) {
        this.name = name;
    }
    public void addEmployee(int index, String name){
        if(index >= developerNames.length){
            System.out.println("Invalid index");
        }
        else if(developerNames[index]==null) {
            developerNames[index] =name;
            System.out.println("Healt plan added successfully. index:" + index );
        }else{
            System.out.println("Index is already occupied");
        }

    }
}
