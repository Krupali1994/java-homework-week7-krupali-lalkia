package homeworkweek7;

/**
 * Person programme
 */
public class Programme14 {
    //Creation of variables
    private String firstName;
    private String lastName;
    private int age;

    //Method to getFirstName without any parameters
    public String getFirstName() {
        return firstName;
    }

    //Method to getLastName without any parameters
    public String getLastName() {
        return lastName;
    }

    //Method to getAge without any parameters
    public int getAge() {
        return age;
    }

    //Method to setFirstName with one parameter of type String
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Method to setLastName with one parameter of type String
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Method to setAge with one parameter of type in
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    //Method to check age of Teen without any parameters
    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    //Method to getFullName without any parameters
    public String getFullName(){
        if(firstName.isEmpty()&& lastName.isEmpty()){
            return "";
        }else if (firstName.isEmpty()){
            return lastName;
        }else if (lastName.isEmpty()){
            return lastName;
        }else{
            return firstName + " " + lastName;
        }
    }


    //Main method
    public static void main(String[] args) {
        Programme14 person = new Programme14();
        person.setFirstName(" ");
        person.setLastName(" ");
        person.setAge(10);
        System.out.println("Full Name: " + person.getFullName());
        System.out.println("Teen: " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("FullName: " + person.getFullName());
        System.out.println("Teen: " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("Full Name: " + person.getFullName());


    }
}
