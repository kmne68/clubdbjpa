
package business;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author kmne6
 */
public class MemberDB {
    
    // Need to find a member in the DB based on member ID
    public static Member getMemberByID(String memid) {
        
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        
        try {
            Member m = em.find(Member.class, memid);
            return m;
        } finally {
            em.close();
        } 
    }
    
    public static String updtMember(Member m) {
        String msg = "";
        
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        
        try {
            
            trans.begin();
            em.merge(m);
            trans.commit();
            msg = "Member " + m.getMemid() + " updated.<br>";
        } catch (Exception e) {
            msg = "Error on member update: " + e.getMessage();
            trans.rollback();
        } finally {
            em.close();
        }
        
        return msg;
    }
}
