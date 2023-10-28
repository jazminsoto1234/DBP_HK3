package com.example.demo.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService{
    @Autowired
    private ProfessorRepository professorRepository;

    public void saveProfessor(Professor professor){
        professorRepository.save(professor);
    }

    public Optional<Professor> findProfessorById(Long id){
        return professorRepository.findById(id);
    }

    public void deleteProfessor(Long id){
        professorRepository.deleteById(id);
    }

}