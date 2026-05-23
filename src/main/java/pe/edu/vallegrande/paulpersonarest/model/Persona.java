package pe.edu.vallegrande.paulpersonarest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.*;
 

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table("PERSONAS")
public class Persona {
    
    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
}
