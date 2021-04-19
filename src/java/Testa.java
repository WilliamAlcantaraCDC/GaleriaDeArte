
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import modelo.Social;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author William Alcântara Coelho da Cruz
 */
public class Testa {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("balanco");

        EntityManager em = factory.createEntityManager();

        Social covid = new Social();
        
        covid.setTitulo("Covid no Brasil");
        covid.setSexo("Feminino");
        covid.setDataMorte(parseData("01/03/2020"));
        covid.setIdade("57 anos");
        covid.setTotal_mortes_brasil("230.034");

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(covid);
        tx.commit();
        em.close();
        factory.close();

    }

    private static Calendar parseData(String data) {
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar;
        } catch (ParseException ex) {
            throw new IllegalArgumentException(ex);
        }
    }
}
