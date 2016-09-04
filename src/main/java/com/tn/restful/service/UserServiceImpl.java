package com.tn.restful.service;

import com.tn.restful.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * Created by thangnguyen-imac on 9/3/16.
 */

@Service(value = "userService")
@Transactional
public class UserServiceImpl implements IUserService {

    private static final AtomicInteger counter = new AtomicInteger();

    private static List<User> users;


    static {
        users = populateDummyUsers();
        
    }

    public static List<User> populateDummyUsers() {

        List<User> users = new ArrayList<User>();
        users.add(new User(counter.incrementAndGet(),"Sam",30, 70000f));
        users.add(new User(counter.incrementAndGet(),"Tom",40, 50000f));
        users.add(new User(counter.incrementAndGet(),"Jerome",45, 30000f));
        users.add(new User(counter.incrementAndGet(),"Silvia",50, 40000f));
        return users;

    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public void create(User user) {
        user.setId(counter.incrementAndGet());
        users.add(user);
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public User findById(Integer id) {
        for(User user : users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public boolean isUserExists(User user) {
        return findById(user.getId()) !=  null;
    }
}
