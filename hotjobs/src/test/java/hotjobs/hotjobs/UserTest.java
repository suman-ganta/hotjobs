package hotjobs.hotjobs;

import hotjobs.user.IUser;
import hotjobs.user.IUserManager;
import hotjobs.user.User;
import hotjobs.user.UserManager;

import org.junit.Test;

public class UserTest {

    @Test
    public void createUser(){
        IUserManager mgr = new UserManager();
        IUser user = new User("sganta");
        user.setDisplayName("Suman Ganta");
        user.setEmail("suman.ganta@hotjobs.com");
        mgr.createUser(user);
    }
    
    public void addNewSlot(){
        
    }
    
    public void updateSlotStatus(){
        
    }
    
    public void calculateEfficiencyRank(){
        
    }
    
    
}
