package peaksoft;

import peaksoft.model.User;
import peaksoft.service.UserService;
import peaksoft.service.UserServiceImpl;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь

//        UserDaoJdbcImpl userDaoJdbc=new UserDaoJdbcImpl();
        UserService userService=new UserServiceImpl();
        User user=new User();
//        userService.createUsersTable();
//        userService.dropUsersTable();
//        userService.saveUser("Nursultan","Tatenov", (byte) 30);
//        userService.saveUser("Mavlyan","Sadirov", (byte) 15);
//        userService.saveUser("Emil","Babakov", (byte) 12);
//        userService.saveUser("Batyr","Karapov", (byte) 45);
//        userService.removeUserById(5);
//        System.out.println(userService.getAllUsers());
//        for (User a:userService.getAllUsers()) { System.out.println(a);}
//        userService.cleanUsersTable();








    }
}


