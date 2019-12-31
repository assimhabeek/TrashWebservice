package dz.stic.trash;

import dz.stic.trash.doa.AdminDAO;
import dz.stic.trash.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class TrashApplication
        // this is just for testing
        /*implements CommandLineRunner */ {

    @Autowired
    AdminDAO adminDAO;

    public static void main(String[] args) {
        SpringApplication.run(TrashApplication.class, args);
    }

/*
    the testing code
    @Override
    public void run(String... args) throws Exception {

        System.out.println("****************************");
        System.out.println(adminDAO.findAll());

        System.out.println("****************************");
        Admin admin = adminDAO.findById(1);
        System.out.println(admin);

        System.out.println("****************************");
        admin.setFirstName("Edited");
        adminDAO.update(admin);
        admin = adminDAO.findById(1);
        System.out.println(admin);


        System.out.println("****************************");
        adminDAO.delete(admin);
        System.out.println(adminDAO.findAll());

        System.out.println("****************************");
        adminDAO.deleteAll();
        System.out.println(adminDAO.findAll());

    }
*/
}
