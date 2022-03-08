
package com.primerExamenMiguelAguero.service;

import com.primerExamenMiguelAguero.entity.Concierto;
import java.util.List;


public interface ConciertoService {
    public List<Concierto> getConciertos();
    
    public void save(Concierto concierto);
    
    public void delete(Concierto concierto);
    
    public Concierto getConcierto(Concierto concierto);
}
