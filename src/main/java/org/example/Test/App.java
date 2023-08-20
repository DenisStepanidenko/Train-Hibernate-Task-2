package org.example.Test;

import org.example.model.Principal;
import org.example.model.School;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration().addAnnotatedClass(Principal.class).addAnnotatedClass(School.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try{
            session.beginTransaction();
            /*
            * С помощью Hibernate получите любого директора, а затем получите его
            * школу.
            */
//            Principal principal = session.get(Principal.class, 1);
//            System.out.println(principal);
//            School school = principal.getSchool();
//            System.out.println(school);

            /*
            * Получите любую школу, а затем получите ее директора
            */
//            School school = session.get(School.class, 4);
//            System.out.println(school);
//            Principal principal = school.getPrincipal();
//            System.out.println(principal);

            /*
            * Создайте нового директора и новую школу и свяжите эти сущности.
            */
//            Principal principal = new Principal("Test Director" , 50);
//            School school = new School(1999);
//            principal.setSchool(school);
//            session.save(principal);


            /*
            * Смените директора у существующей школы.
            */
//            School school = session.get(School.class, 3);
//            Principal principal = school.getPrincipal();
//            principal.setSchool(null);
//            Principal principal1 = new Principal("Test 2" , 90);
//            principal1.setSchool(school);
//            session.save(principal1);

            /*
            * Попробуйте добавить вторую школу для существующего директора и
            *  изучите возникающую ошибку.
            */
//            Principal principal = session.get(Principal.class, 1);
//            School school = new School(14983);
//            school.setPrincipal(principal);
//            session.save(school);
            // ошибка из-за того, что должен быть уникальным principal_id
            session.getTransaction().commit();
        }
        finally {
            session.close();
        }
    }
}
