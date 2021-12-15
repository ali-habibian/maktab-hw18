package ir.maktab.w18.dao;

import ir.maktab.w18.entity.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class BookDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("FormPersistence");
    EntityManager em = emf.createEntityManager();

    public void save(Book book) {
        em.getTransaction().begin();
        em.persist(book);
        em.getTransaction().commit();
    }

    public List<Book> getAll() {
        TypedQuery<Book> books = em.createQuery("select b from Book b", Book.class);
        return books.getResultList();
    }
}
