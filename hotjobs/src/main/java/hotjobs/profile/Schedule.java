package hotjobs.profile;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Schedule {
    Set<Slot> slots = new HashSet<Slot>();

    public static class Slot{
        Date startTime;
        Date endTime;
        
        public enum State{
            SCHEDULED, OPEN
        }
    }
}
