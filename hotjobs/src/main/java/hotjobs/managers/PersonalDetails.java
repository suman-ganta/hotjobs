package hotjobs.managers;

import hotjobs.profile.IPersonalDetails;

public class PersonalDetails implements IPersonalDetails{

    private String firstName;
    private String lastName;
    
    public PersonalDetails(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    @Override
    public Integer getProfileId() {
        // TODO Auto-generated method stub
        //need to implement this.
        return null;
    }
    @Override
    public String getUserId() {
        // TODO Auto-generated method stub
        return null;
    }

}
