
 
package com.proyecto.ejemplo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;



@Entity
@Data
public class Aprendiz {
    
    
    @Id
    @Column
    private Long iduser;
    @Column 
    private String nomuser;
    @Column 
    private String apellidos;
    @Column 
    private String email;
    
}
