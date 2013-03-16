package hotjobs.managers;

import java.util.Date;

public interface ISlotManager {
    String/**slot id*/ addSlot(String userId, Date startTime, Date endTime);
    
    void bookSlot(String userId, String slotId);
}
