package com.java17students;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    public  boolean savesStudentsToDatabase(Student st){
    Transaction transaction = null;
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try(
    Session session = sessionFactory.openSession())

    {
        transaction = session.beginTransaction();
        session.save(st);

        transaction.commit();

    }catch(
    SecurityException se)

    {
        if (transaction != null) {
            transaction.rollback();

        }
        return false;
    }
    return true;
}

public List<Student> getAllStudentFromDatabase (){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        try (Session session = sessionFactory.openSession()){
            Query<Student> query = session.createQuery("from Student st",Student.class);

            List<Student>students=query.list();

            return  students;

        }catch (SecurityException se){

        }
        return  new ArrayList<>();
}

}


