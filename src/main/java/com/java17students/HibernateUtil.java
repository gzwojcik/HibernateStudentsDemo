package com.java17students;


import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

//niezb jako punkt conf polaczenia z hibernate
public class HibernateUtil {


    private static SessionFactory sessionFactory;

    static {
        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();

        Metadata metadata =new MetadataSources(standardServiceRegistry)
                .getMetadataBuilder().build();

        //sesja danych z pliku cfg xml
        sessionFactory=metadata.getSessionFactoryBuilder().build();
    }


    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
