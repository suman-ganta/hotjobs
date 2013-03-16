package hotjobs.user;

import java.util.Date;

import hotjobs.profile.IPersonalDetails;
import hotjobs.profile.Schedule.Slot.BookingDetails;
import hotjobs.user.eo.UserEO;

public interface IUserManager {
    void createUser(IUser user);
    void createProfile(String userId, IPersonalDetails details);
    String/*slot id*/ addSlot(String userId, Date startTime, Date endTime);
    void bookSlot(String slotUserId, String bookingUserId, String slotId, BookingDetails details);
    void releaseSlot(String userId, String slotId);
}
