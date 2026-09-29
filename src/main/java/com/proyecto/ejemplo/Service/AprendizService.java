
package com.proyecto.ejemplo.Service;

import com.proyecto.ejemplo.Model.Aprendiz;


public interface AprendizService {
    
    Aprendiz newAprendiz(Aprendiz newAprendiz);
    Iterable<Aprendiz> getAll();  //hacer el recorrido y sacar todos lod datos 
    Aprendiz modyfyAprendiz(Aprendiz aprendiz);
    Boolean deleteAprendiz(Long iduser);
    
}
