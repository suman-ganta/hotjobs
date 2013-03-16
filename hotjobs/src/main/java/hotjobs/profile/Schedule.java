package hotjobs.profile;

import hotjobs.address.IAddress;
import hotjobs.user.IUser;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * A schedule is a bunch of slots
 * @author sumagant
 *
 */
public class Schedule {
    Set<Slot> slots = new HashSet<Slot>();

    /**
     * slot is time duration with status
     * @author sumagant
     *
     */
    public interface Slot{
        String getId();
        Date getStartTime();
        Date getEndTime();
        State getState();
        long getPrice();
        BookingDetails getBookingDetails();
        Date getCheckInTime();
        
        boolean isBooked();
        
        boolean isCheckedIn();
        
        public enum State{
            SCHEDULED,
            OPEN
        }
        
        public static class BookingDetails{
            IUser bookedBy;
            IAddress siteLocation;
        }
    }
}
