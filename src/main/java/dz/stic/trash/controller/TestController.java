package dz.stic.trash.controller;

import dz.stic.trash.doa.AdminDAO;
import dz.stic.trash.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class TestController {

    @Autowired
    AdminDAO adminDAO;

    @GetMapping("/")
    public List<Admin> findAll() {
        return adminDAO.findAll();
    }

    @GetMapping("/{id}")
    public Admin findById(@PathVariable Integer id) {
        return adminDAO.findById(id);
    }


}
