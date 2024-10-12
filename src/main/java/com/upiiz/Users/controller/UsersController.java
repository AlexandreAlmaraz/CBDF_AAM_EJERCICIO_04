package com.upiiz.Users.controller;

import com.upiiz.Users.models.User;
import com.upiiz.Users.service.UsersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/suppliers")
@RestController
public class UsersController {
    // Requiero INYECTAR el servicio
    UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    // GET - Todas las Suppliers
    @GetMapping
    public ResponseEntity<List<User>> getSuppliers() {
        return ResponseEntity.ok(usersService.getAllSuppliers());  // Este también debería estar correcto
    }
    // GET - Solo un Supplier
    @GetMapping("/{id}")
    public ResponseEntity<User> getSupplier(@PathVariable Long id) {
        return ResponseEntity.ok(usersService.getSupplierById(id));
    }

    // POST - Crear un Supplier
    @PostMapping
    public ResponseEntity<User> addSupplier(@RequestBody User user) {
        return ResponseEntity.ok(usersService.createSupplier(user));
    }

    // PUT - Actualizar un Supplier
    @PutMapping("/{id}")
    public ResponseEntity<User> updateSupplier(@RequestBody User user, @PathVariable Long id) {
        user.setId(id);
        return ResponseEntity.ok(usersService.updateSupplier(user));
    }

    // DELETE - Eliminar una Supplier por Id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSupplier(@PathVariable Long id) {
        usersService.deleteSupplier(id);  // Ahora debería estar correcto
        return ResponseEntity.noContent().build();
    }
}
