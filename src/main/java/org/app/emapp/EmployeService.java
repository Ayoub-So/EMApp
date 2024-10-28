package org.app.emapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public void deleteEmploye(Employe employee) {
        employeRepository.delete(employee);
    }

    public Employe getEmploye(String id) {
        return employeRepository.getReferenceById(id);
    }
}
