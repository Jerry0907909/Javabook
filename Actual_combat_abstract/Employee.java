package Module10.Actual_combat_abstract;

public abstract class Employee {//标准的JavaBean
    private int id;
    private String name;

    public void work(){

    }

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
