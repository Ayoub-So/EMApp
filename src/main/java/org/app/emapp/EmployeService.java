package org.app.emapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeService {

    @Autowired
    private EmployeRepository employeRepository;

    public List<Employe> getAllEmploye() {
        List<Employe> employes = new ArrayList<>();
        employeRepository.findAll().forEach(employes::add);
        return employes;
    }

    public void saveEmploye(Employe employe) {
        employeRepository.save(employe);

    }

    public void deleteEmploye(String id) {
        employeRepository.deleteById(id);
    }

    public Employe getEmploye(String id) {
        return employeRepository.getReferenceById(id);
    }

    public Optional<Employe> findById(String id) {
        return employeRepository.findById(id);
    }

}
