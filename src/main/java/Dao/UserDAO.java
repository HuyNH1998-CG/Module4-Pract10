package Dao;

import Model.Login;
import Model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class UserDAO {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User u1 = new User("John","123456","John","john@codegym.vn",10);
        User u2 = new User("Bill","123456","Bill","bill@codegym.vn",15);
        User u3 = new User("Mike","123456","Mike","mike@codegym.vn",16);
        users.add(u1);
        users.add(u2);
        users.add(u3);
    }
    public static User checkLogin(Login login){
        for(User u : users){
            if(u.getAccount().toLowerCase(Locale.ROOT).equals(login.getAccount().toLowerCase(Locale.ROOT))&&u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
