package com.upiiz.Users.service;

import com.upiiz.Users.repository.UsersRepository;
import com.upiiz.Users.models.User;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UsersService {
    // Requerimos el REPO (Datos - Listado) - Categorías
    // Requiero "INYECTAR" el servicio

    UsersRepository usersRepository;

    // Constructor - Cuando crea la instancia le pasa el repositorio
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    // GET - Todas las suppliers
    public List<User> getAllSuppliers() {
        return usersRepository.obtenerTodas();
    }

    // GET - Supplier por ID
    public User getSupplierById(Long id) {
        return usersRepository.obtenerPorId(id);
    }

    // POST - Crear supplier
    public User createSupplier(User user) {
        return usersRepository.guardar(user);
    }

    // PUT - Actualizar supplier
    public User updateSupplier(User user) {
        return usersRepository.actualizar(user);
    }

    // DELETE - Eliminar supplier
    public void deleteSupplier(Long id) {
        usersRepository.eliminar(id);
    }
}
