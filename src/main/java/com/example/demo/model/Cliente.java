package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 100)
    private String nombre;
    
    @Column(name = "tipo_documento", length = 20)
    private String tipoDocumento;
    
    @Column(name = "numero_documento", unique = true, length = 30)
    private String numeroDocumento;
    
    @Column(length = 100)
    private String email;
    
    @Column(length = 20)
    private String telefono;
    
    @Column(length = 255)
    private String direccion;
    
    @Column(length = 100)
    private String ciudad;
    
    @Column(length = 100)
    private String provincia;
    
    @Column(length = 50)
    private String pais;
    
    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;
    
    private Boolean activo = true;
}
