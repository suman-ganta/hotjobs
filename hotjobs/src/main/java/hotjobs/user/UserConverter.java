package hotjobs.user;

import hotjobs.user.eo.UserEO;

public class UserConverter {
    public static UserEO createUserEntity(IUser user){
        UserEO eo = new UserEO();
        eo.setDisplayName(user.getDisplayName());
        eo.setCountry(user.getCountry());
        eo.setEmail(user.getEmail());
        eo.setUserId(user.getId());
        return eo;
    }
}
