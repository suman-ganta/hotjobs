package hotjobs.profile;

import hotjobs.user.IUser;

import java.util.Map;

public class Profile {
    IUser mUser;
    String mFistName;
    String mLastName;
    Map<String, Skill> mSkills;
    Schedule mSchedule;
}
