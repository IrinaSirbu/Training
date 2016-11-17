package model;

/**
 * Created by isirbu on 11/14/2016.
 */

public class User {

    private String userName;
    private String firstName;
    private String lastName;
    private int age;

    public User(){}

    public User(String userName, String firstName, String lastName, int age) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void update(User user){

        if(!firstName.equals(user.getFirstName())){
            firstName = user.getFirstName();
        }

        if(!lastName.equals(user.getLastName())){
            lastName = user.getLastName();
        }

        if(age != user.getAge()){
            age = user.getAge();
        }
    }

    @Override
    public String toString() {
        return "User{" +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
