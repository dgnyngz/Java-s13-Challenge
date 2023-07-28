package employeeApp.model;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public String[] getHealthplans() {
        return healthplans;
    }
    public Employee(int id,String fullName,String email,String password,String[] healthplans) {
        this.id=id;
        this.fullName=fullName;
        this.email=email;
        this.password=password;
        this.healthplans=healthplans;
    }


    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void addHealthplan(int index, String name){
        if(healthplans[index]==null ){
            healthplans[index] =name;
            System.out.println("Healt plan added successfully. index:" + index );

        }
        else if(index >= healthplans.length) {
             System.out.println("Invalid index");
        }else{
            System.out.println("Index is already occupied");
        }
    }

    @Override
    public String toString() {
        return "Employee" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplans=" + Arrays.toString(healthplans) +
                ' ';
    }
}
