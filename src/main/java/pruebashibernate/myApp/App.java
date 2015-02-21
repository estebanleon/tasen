package pruebashibernate.myApp;

import java.io.File;
import java.util.List;
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	private static SessionFactory factory;
		Session s = SessionFactoriU
	
    public static void main( String[] args )
    {
    	//sincronizado
    	try{
            factory = new Configuration().configure().buildSessionFactory();
         }catch (Throwable ex) { 
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex); 
         }
    	App AP = new App();
    	AP.listCentros();
        System.out.println( "Hello World!" );
    }
    
    public void listCentros()
    {
    	Session session = factory.openSession();
    	Transaction tx = null;
    	try{
    		tx = session.beginTransaction();
    		List centros = session.createQuery("FROM centro").list();
    	}
    	finally
    	{}
    }
}
