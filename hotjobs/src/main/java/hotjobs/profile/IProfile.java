package hotjobs.profile;

import hotjobs.user.IUser;

import java.util.Map;

/**
 * Each user can have one or more profiles
 * @author sumagant
 *
 */
public interface IProfile {
    String getId();
    IUser getUser();
    IPersonalDetails getPersonalDetails();
    Map<String, Skill> getSkills();
    String getDescription();
    //other general profile sections
    Schedule getSchedule();
}
