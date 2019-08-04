/*Przykład 3
 * Pokazanie jak dziala dziedziczenie table per subclass*/

package sda.hibernate.entity.przyklad3;

import org.hibernate.Session;
import sda.hibernate.HibernateUtil;

public class przyklad3 {

    public static void main(String[] arg) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Samochod3 samochod = new Samochod3();
        samochod.setMarka("opel astra");
        samochod.setCena(60000);
        samochod.setOpis("opis opla astry");
        session.persist(samochod);

        Telefon3 telefon = new Telefon3();
        telefon.setCena(3200);
        telefon.setNazwaModelu("Samsung S8");
        telefon.setOpis("calkiem niezly telefon");
        session.persist(telefon);
        session.flush();
        session.close();
    }
}
