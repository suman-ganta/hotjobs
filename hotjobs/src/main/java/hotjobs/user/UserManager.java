package hotjobs.user;

import hotjobs.common.Util;
import hotjobs.profile.IPersonalDetails;
import hotjobs.profile.ProfileConverter;
import hotjobs.profile.Schedule.Slot.BookingDetails;
import hotjobs.profile.eo.UserProfileEO;
import hotjobs.user.eo.UserEO;

import java.util.Date;

import javax.persistence.EntityManager;

public class UserManager implements IUserManager{

    public void createUser(IUser user) {
        UserEO userEO = UserConverter.createUserEntity(user);
        // Begin a new local transaction so that we can persist a new entity
        EntityManager em = Util.getEntityManager();
        em.getTransaction().begin();
        em.persist(userEO);
        em.getTransaction().commit();
    }

    public void createProfile(String userId, IPersonalDetails details) {
        UserProfileEO profileEO = ProfileConverter.createUserProfileEO(details);
        EntityManager em = Util.getEntityManager();
        em.getTransaction().begin();
        em.persist(profileEO);
        em.getTransaction().commit();
    }

    public String addSlot(String userId, Date startTime, Date endTime) {
        // TODO Auto-generated method stub
        return null;
    }

    public void bookSlot(String slotUserId, String bookingUserId,
            String slotId, BookingDetails details) {
        // TODO Auto-generated method stub
        
    }

    public void releaseSlot(String userId, String slotId) {
        // TODO Auto-generated method stub
        
    }

}
