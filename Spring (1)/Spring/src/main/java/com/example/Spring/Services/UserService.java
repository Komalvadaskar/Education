package com.example.Spring.Services;

import com.example.Spring.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService{
private List<User> store=new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Komal","komal@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Ganesh","abc@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Mauli","123@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Payal","mauli@gmail.com"));


    }


    public List<User> getUsers() {
        return this.store;
    }
}
