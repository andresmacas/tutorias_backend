package com.sgTutorias.app.rest.modelo_rest;

import java.util.Date;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.sgTutorias.app.modelo.Persona;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PersonaWS {
    @NotBlank(message = "Campo apellidos es requerido")
    @Size(min = 2, max = 75)
    private String apellidos;
    @NotBlank(message = "Campo nombres es requerido")
    @Size(min = 3, max = 75)
    private String nombres;
    @NotBlank(message = "Campo identificacion es requerido")
    @Size(min = 7, max = 15)
    private String identificacion;
    @NotBlank(message = "Campo direccion es requerido")
    @Size(max = 255)
    private String direccion;
    @NotBlank(message = "Campo telefono es requerido")
    @Size(min = 10, max = 15)
    private String telefono;
    private String external_id;
    private String tipo_persona;
    private CuentaWS cuenta;
    private String external_cuenta;
/**
 * 
 * @param persona
 * Este método se utiliza para cargar objetos y datos de la persona. si es que está null se crea un nuevo Persona 
 * @return
 */
    public Persona cargarObjeto(Persona persona) {
        if (persona == null) {
            persona = new Persona();
        }
        persona.setApellidos(apellidos);
        persona.setNombres(nombres);
        persona.setDireccion(direccion);
        persona.setExternal_id(UUID.randomUUID().toString());
        persona.setIdentificacion(identificacion);
        persona.setTelefono(telefono);
        persona.setUpdateAt(new Date());
        return persona;
    }
}