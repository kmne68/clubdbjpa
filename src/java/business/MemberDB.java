
package business;

import javax.persistence.EntityManager;

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
}
