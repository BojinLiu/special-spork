package com.origin.liubojin.project.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * @author liubojin
 * Created on 2018/4/11
 */
public final class HibernateUtil {
    private HibernateUtil() {
    }

    private static SessionFactory sessionFactory;

    static {
        Configuration config = new Configuration().configure();
        ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(config.getProperties());
        ServiceRegistry registry = builder.buildServiceRegistry();
        sessionFactory = config.buildSessionFactory(registry);
    }

    public static SessionFactory getSeesionFactory() {
        return sessionFactory;
    }

    public static Session getSession() {
        return sessionFactory.openSession();
    }

}