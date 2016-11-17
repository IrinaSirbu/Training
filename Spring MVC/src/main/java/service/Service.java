package service;

import model.User;
import javax.annotation.PostConstruct;
import java.util.ArrayList;

/**
 * Created by isirbu on 11/14/2016.
 */

@org.springframework.stereotype.Service
public class Service {

    private static ArrayList<User> users;

    @PostConstruct
    public void service(){
        users = new ArrayList<User>();
        users.add(new User("irinas","Irina","Sirbu",22));
    }

    public User save(User user){
        users.add(user);
        return user;
    }

    public ArrayList<User> getUsers(){
        return users;
    }

    public void delete(User user){

        for (User a : users){
            if(a.getUserName().equals(user.getUserName())){
                users.remove(a);
                break;
            }
        }
    }

    public User update(User user){

        for (User a : users){
            if(a.getUserName().equals(user.getUserName())){
                a.update(user);
                return a;
                //break;
            }
        }

        return user;
    }
}
