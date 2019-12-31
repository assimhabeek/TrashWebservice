package dz.stic.trash.model;

import java.sql.Date;

public abstract class User {

    protected Integer id;
    protected String lastName;
    protected String firstName;
    protected String email;
    protected String username;
    protected String password;
    protected Date birthDate;
    protected String phone;

    public User() {
    }

    public User(String lastName, String firstName, String email, String username, String password, Date birthDate, String phone) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public boolean equals(Object obj) {
        return obj instanceof User && this.id.equals(((User) obj).getId());
    }

}
