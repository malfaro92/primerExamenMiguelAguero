
package com.primerExamenMiguelAguero.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="concierto")
public class Concierto implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    
    private Long idconcierto;
    
    private String artista;
    private String costo;
    private String fecha;
    private String capacidad_maxima;
    private String lugar;

    public Concierto(Long idconcierto, String artista, String costo, String fecha, String capacidad_maxima, String lugar) {
        this.idconcierto = idconcierto;
        this.artista = artista;
        this.costo = costo;
        this.fecha = fecha;
        this.capacidad_maxima = capacidad_maxima;
        this.lugar = lugar;
    }

    public Concierto() {
    }
    
    
}
