package Encapsulation;

public class User {

    private final String userName;
    private final String firstName;
    private final String lastName;

    public User(String userName, String firstName, String lastName) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    //public void setUserName(String userName) {
    //    this.userName = userName;
    //}

    public String getFirstName() {
        return firstName;
    }

   // public void setFirstName(String firstName) {
   //     this.firstName = firstName;
   // }

    public String getLastName() {
        return lastName;
    }

    //public void setLastName(String lastName) {
    //    this.lastName = lastName;
    //}

    public String DisplayName(){
        String stringWithTheFullName = getFirstName().concat(getLastName());
        return stringWithTheFullName;
    }
}
