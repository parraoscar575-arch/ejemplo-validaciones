package com.proyecto.ejemplo.service;

import com.proyecto.ejemplo.model.Aprendiz;
import com.proyecto.ejemplo.repository.AprendizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
* Servicio que implementa la lógica de negocio para gestionar los aprendices.
*/
@Service
public class AprendizServiceImpl implements AprendizService {

private final AprendizRepository aprendizRepository;

/**
* Constructor para inyectar el repositorio de aprendices.
* @param aprendizRepository Repositorio de acceso a datos de aprendices.
*/
@Autowired
public AprendizServiceImpl(AprendizRepository aprendizRepository) {
this.aprendizRepository = aprendizRepository;
}

/**
* Registra un nuevo aprendiz en el sistema.
* @param aprendiz Objeto Aprendiz a guardar.
* @return El aprendiz guardado.
*/
@Override
public Aprendiz nuevoAprendiz(Aprendiz aprendiz) {
return aprendizRepository.save(aprendiz);
}

/**
* Obtiene una lista de todos los aprendices registrados.
* @return Iterable con la lista de aprendices.
*/
@Override
public Iterable<Aprendiz> getAll() {
return aprendizRepository.findAll();
}

/**
* Modifica los datos de un aprendiz existente.
* @param aprendiz Objeto Aprendiz con los datos actualizados.
* @return El aprendiz modificado.
*/
@Override
public Aprendiz modificarAprendiz(Aprendiz aprendiz) {
return aprendizRepository.save(aprendiz);
}

/**
* Elimina un aprendiz según su ID (verificando existencia previa).
* @param iduser Identificador del aprendiz a eliminar.
* @return true si se eliminó con éxito, false en caso contrario.
*/
@Override
public boolean deleteAprendiz(Long iduser) {
if (aprendizRepository.existsById(iduser)) {
aprendizRepository.deleteById(iduser);
return true;
}
return false;
}

/**
* Elimina un aprendiz del sistema según su ID.
* @param id Identificador del aprendiz a eliminar.
*/
@Override
public void eliminar(Long id) {
aprendizRepository.deleteById(id);
}

    @Override
    public Aprendiz newAprendiz(Aprendiz newAprendiz) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
