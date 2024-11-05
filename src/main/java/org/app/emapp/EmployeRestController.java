package org.app.emapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public void addEmploye(@RequestBody Employe employe){
        employeService.saveEmploye(employe);
    }

    @DeleteMapping("/deleteEmploye/{id}")
    public void deleteById(@PathVariable String id) {
        employeService.deleteEmploye(id);
    }

    @GetMapping("/getEmploye/{id}")
    public Optional<Employe> findById(@PathVariable String id) {
        return employeService.findById(id);
    }


}
