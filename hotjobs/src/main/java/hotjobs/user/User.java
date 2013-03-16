package hotjobs.user;

public class User implements IUser{

    private String userid;
    private String displayName;
    private String email;
    private String country;

    public User(String userid){
        setId(userid);
    }
    @Override
    public String getId() {
        return userid;
    }

    @Override
    public void setId(String userId) {
        this.userid = userId;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }
}
