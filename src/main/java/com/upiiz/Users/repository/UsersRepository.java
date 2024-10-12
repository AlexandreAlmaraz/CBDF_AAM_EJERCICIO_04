package com.upiiz.Users.repository;


import com.upiiz.Users.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
@Repository
public class UsersRepository {
    private List<User> users = new ArrayList<User>();

    private AtomicLong id = new AtomicLong();


    public User guardar(User user){
        user.setId(id.incrementAndGet());
        users.add(user);
        return user;
    }

    // GET - Todas las categorias
    public List<User> obtenerTodas() {
        return users;
    }



    //Get solo un Suppliers
    public User obtenerPorId(Long id){
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);

    }

    // DELETE
    public void eliminar(Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }

    // PUT
    public User actualizar(User user) {
        eliminar(user.getId());
        users.add(user);
        return user;
    }
}
