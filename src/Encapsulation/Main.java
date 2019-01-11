package Encapsulation; //a way to hide my implementation / state;
                      // members are private and i use get-ers and set-ers;
public class Main {
    public static void main(String[] args) {
        User user1 = new User("007", "James"," Bond");
        User user2 = new User("wizard", "Gandalf"," The Gray");

        System.out.println("The name of the fist user is ->" + user1.DisplayName());
        System.out.println("The name of the second user is ->" + user2.DisplayName());

        //the object User is immutable by commenting the set-er in class user (or deleting it) and the field class is final;
        //if i remove the comments the parameters of the object can be changed like this-> user1.setLastName("abc");
    }
}
