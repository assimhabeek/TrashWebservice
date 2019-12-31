package dz.stic.trash.doa;


import dz.stic.trash.model.Admin;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDAO extends BaseDAO<Admin> {

    @Autowired
    SessionFactory sessionFactory;


    public AdminDAO() {
        super(Admin.class, "Admin");
    }

    public Session openCurrentSession() {
        currentSession = sessionFactory.openSession();
        return currentSession;
    }

    public Session openCurrentSessionwithTransaction() {
        currentSession = sessionFactory.openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }


}
