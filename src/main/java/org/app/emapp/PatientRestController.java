package org.app.emapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeRestController {

    @Autowired
    private EmployeService employeService;

    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }

    @GetMapping("/listEmploye")
    public List<Employe> getAllEmploye(){
        return employeService.getAllEmploye();

    }

    @RequestMapping(method = RequestMethod.POST, value = "/addEmploye")
    public void addPatient(@RequestBody Employe employe){
        //System.out.println(patient.getId()+" "+patient.getNom()+" "+patient.getNum());
        employeService.saveEmploye(employe);
    }

}
