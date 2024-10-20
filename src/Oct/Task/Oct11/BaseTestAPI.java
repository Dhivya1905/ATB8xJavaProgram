package Oct.Task.Oct11;

public class BaseTestAPI {

    //Encapsulation
    private String name;
    private int id;

    //Default Constructor
    public BaseTestAPI() {
        System.out.println("This is DC BaseTestAPI");
    }
//Parametrised Constructor
    public BaseTestAPI(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("This is PC BaseTestAPI");
    }

    //Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name,boolean IsAdmin) {
        if(IsAdmin)
        {this.name = name;}
        else { System.out.println("Not an Admin,Cannot Set");}
    }

    public int getId() {
        return id;
    }

    public void setId(int id,boolean IsAdmin) {

        if(IsAdmin)
        {this.id = id;}
        else{System.out.println("Not an Admin,Cannot Set");}
    }

    // method overloading
  void performGet() {
        System.out.println("Perform Get operation");
}

    void performGet(String Name) {
        System.out.println("Perform Get operation-->>" + Name);
    }


    void performPost() {
        System.out.println("Perform Post operation");
    }


    void performPatch() {
        System.out.println("Perform Patch operation");
    }

    void performPut() {
        System.out.println("Perform Put operation");
    }


    void performDelete() {
        System.out.println("Perform Delete operation");
    }
}
