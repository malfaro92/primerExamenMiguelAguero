
package com.primerExamenMiguelAguero.service;

import com.primerExamenMiguelAguero.dao.ConciertoDao;
import com.primerExamenMiguelAguero.entity.Concierto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ConciertoServiceImpl implements ConciertoService {
  
    @Autowired
    
    private ConciertoDao conciertoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Concierto> getConciertos() {
        return (List<Concierto>) conciertoDao.findAll(); 
    }

    @Override
    @Transactional
    public void save(Concierto concierto) {
        conciertoDao.save(concierto); 
    }

    @Override
    @Transactional
    public void delete(Concierto concierto) {
        conciertoDao.delete(concierto); 
    }

    @Override
    @Transactional(readOnly = true)
    public Concierto getConcierto(Concierto concierto) {
        return conciertoDao.findById(concierto.getIdconcierto()).orElse(null);
    }
}
