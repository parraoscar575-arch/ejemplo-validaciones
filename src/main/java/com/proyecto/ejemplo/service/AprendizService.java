package com.proyecto.ejemplo.service;

import com.proyecto.ejemplo.model.Aprendiz;

public interface AprendizService {
Aprendiz newAprendiz(Aprendiz newAprendiz);
Iterable<Aprendiz> getAll();
Aprendiz modificarAprendiz(Aprendiz aprendiz);
boolean deleteAprendiz(Long iduser);

    public void eliminar(Long id);

    public Aprendiz nuevoAprendiz(Aprendiz aprendiz);

}