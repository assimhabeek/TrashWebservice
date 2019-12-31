package dz.stic.trash.model;

import java.sql.Date;

public class Admin extends User {

    public Admin(String lastName, String firstName, String email, String username, String password, Date birthDate, String phone) {
        super(lastName, firstName, email, username, password, birthDate, phone);
    }

    public Admin() {
        super();
    }


    @Override
    public boolean equals(Object obj) {
        return obj instanceof Admin && this.id.equals(((Admin) obj).getId());
    }

}
