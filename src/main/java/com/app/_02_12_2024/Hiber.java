package com.app._02_12_2024;

import com.app._15_11_2024.Author;
import lombok.Getter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import java.util.List;

public class Hiber {

    private static SessionFactory buildSession() {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Author.class);


        ServiceRegistry serviceRegistry =
                new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();

        return configuration.buildSessionFactory(serviceRegistry);
    }

    public static void main(String[] args) {
        SessionFactory factory = Hiber.buildSession();
        Session session = factory.openSession();

        Query<Author> query = session.createQuery("from com.app._15_11_2024.Author", Author.class);
        List<Author> authors = query.list();

        for (Author author : authors) {
            System.out.println("ID: " + author.getId() + " : " + "NAME: " + author.getName());
        }
    }
}