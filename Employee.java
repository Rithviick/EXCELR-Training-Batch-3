public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String address;

    public Employee() {
        this.id = 0;
        this.firstName = "Rithvick";
        this.lastName = "Reddy";
        this.address = "Anywhere";
    }

    public Employee(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println("Default Constructor:");
        System.out.println("Full Name: " + emp1.getFullName());

        Employee emp2 = new Employee(1, "Rithvick", "Reddy", "Anywhere");
        System.out.println("\nParameterized Constructor:");
        System.out.println("Full Name: " + emp2.getFullName());
    }
}
