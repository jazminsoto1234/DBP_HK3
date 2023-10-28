package com.example.demo.Periodo.Service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Periodo.Domain.Periodo;
import com.example.demo.Periodo.Domain.PeriodoRepository;

@Service
public class PeriodoService {
    @Autowired
    private PeriodoRepository periodoRepository;

    public Periodo savePeriodo(Periodo periodo){
        return periodoRepository.save(periodo);
    }

    public Periodo  savePeriodo( Periodo periodo ,Long id){
        Optional<Periodo> existe= periodoRepository.findById(id);
        if (existe.isPresent()){
            throw new RuntimeException("Ya existe un periodo con este ID");   }
        else{
            periodo.setid(id);
            return  periodoRepository.save( periodo);
        }
    }

    public Periodo getByPeriodoId(Long id){
        return periodoRepository.findById(id).get();
    }

    public void deletePeriodoById(Long id) {
        periodoRepository.deleteById(id);
    }

    public Periodo partialUpdatePeriodo(Long id ,  Periodo periodo ){
        Optional<Periodo> existePeriodo =  periodoRepository.findById(id);
        if (existePeriodo.isPresent()){
            BeanUtils.copyProperties( periodo, existePeriodo.get(), "id");
            return periodoRepository.save(existePeriodo.get());
        }
        return null;
    }
}
