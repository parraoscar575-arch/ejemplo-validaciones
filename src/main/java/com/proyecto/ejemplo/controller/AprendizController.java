package com.proyecto.ejemplo.controller;

import com.proyecto.ejemplo.model.Aprendiz;
import com.proyecto.ejemplo.service.AprendizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador para gestionar las operaciones de los aprendices.
 */
@RestController
@RequestMapping("/aprendiz")
public class AprendizController {

    private final AprendizService aprendizService;

    /**
     * Constructor para inyectar la dependencia del servicio.
     * @param aprendizService Servicio para la lógica de negocio de los aprendices.
     */
    @Autowired
    public AprendizController(AprendizService aprendizService) {
        this.aprendizService = aprendizService;
    }

    /**
     * Registra un nuevo aprendiz en el sistema.
     * @param aprendiz Datos del aprendiz a registrar.
     * @return ResponseEntity con el aprendiz creado y el estado HTTP 201.
     */
    @PostMapping("/nuevo")
    public ResponseEntity<Aprendiz> nuevoAprendiz(@RequestBody Aprendiz aprendiz) {
        Aprendiz creado = aprendizService.nuevoAprendiz(aprendiz);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    /**
     * Obtiene todos los aprendices registrados.
     * @return Iterable con la lista de todos los aprendices y el estado HTTP 200.
     */
    @GetMapping("/todos")
    public ResponseEntity<Iterable<Aprendiz>> obtenerTodos() {
        Iterable<Aprendiz> lista = aprendizService.getAll();
        return ResponseEntity.ok(lista);
    }

    /**
     * Modifica los datos de un aprendiz existente.
     * @param aprendiz Datos del aprendiz a modificar.
     * @return ResponseEntity con el aprendiz modificado y el estado HTTP 200.
     */
    @PutMapping("/modificar")
    public ResponseEntity<Aprendiz> modificarAprendiz(@RequestBody Aprendiz aprendiz) {
        Aprendiz modificado = aprendizService.modificarAprendiz(aprendiz);
        return ResponseEntity.ok(modificado);
    }

    /**
     * Elimina un aprendiz del sistema mediante su ID.
     * @param id ID del aprendiz a eliminar.
     * @return ResponseEntity con estado HTTP 204.
     */
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> eliminarAprendiz(@PathVariable Long id) {
        aprendizService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}