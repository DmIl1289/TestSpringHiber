package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserDao {
   void add(User user, Car car);
   User get(String name, int series);
   List<User> listUsers();
}
