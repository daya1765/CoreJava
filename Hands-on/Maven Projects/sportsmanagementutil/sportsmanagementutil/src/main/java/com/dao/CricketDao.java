package com.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.util.HibernateUtil;
import com.entity.Cricket;



public class CricketDao {
	/**
     * Save Cricket
     * @param cricket
     */
    public void saveCricket(Cricket cricket) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
      
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(cricket);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

 

    /**
     * Update Cricket
     * @param cricket
     */
    public void updateCricket(Cricket cricket) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.update(cricket);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

 

    /**
     * Delete Cricket
     * @param id
     */
    public void deleteCricket(int id) {

 

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

 

            // Delete a instructor object
            Cricket cricket = session.get(Cricket.class, id);
            if (cricket != null) {
                session.delete(cricket);
                System.out.println("cricket is deleted");
            }

 

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

 

    /**
     * Get Cricket By ID
     * @param id
     * @return
     */
    public Cricket getCricket(int id) {

 

        Transaction transaction = null;
        Cricket cricket = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an Cricket object
            cricket = session.get(Cricket.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return cricket;
    }
    
    /**
     * Get all Cricket
     * @return
     */
    @SuppressWarnings("unchecked")
    public List<Cricket> getAllInstructor() {

 

        Transaction transaction = null;
        List<Cricket> listOfCricket = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an instructor object
            
            listOfCricket = session.createQuery("from Cricket").getResultList();
            
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return listOfCricket;
    }

}
