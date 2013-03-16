package hotjobs.user.eo;

import hotjobs.groups.eo.GroupEO;
import hotjobs.profile.eo.UserProfileEO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class UserEO {
    @Id
    private String userId;
    private String passwordHash;
    private String displayName;
    private String email;
    private String country;
    private String role;
    @JoinColumn(
        name = "GROUPID",
        nullable = true
    )
    @OneToOne(targetEntity = GroupEO.class)
    private GroupEO group;
    
    /*@ManyToOne(
            targetEntity = UserProfileEO.class,
            cascade = CascadeType.REMOVE
           )
    private List<UserProfileEO> userProfiles = new ArrayList<UserProfileEO>();*/
    
    
    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }
    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    /**
     * @return the passwordHash
     */
    public String getPasswordHash() {
        return passwordHash;
    }
    /**
     * @param passwordHash the passwordHash to set
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
    /**
     * @return the displayName
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * @param displayName the displayName to set
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }
    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }
    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }
    /**
     * @return the group
     */
    public GroupEO getGroup() {
        return group;
    }
    /**
     * @param group the group to set
     */
    public void setGroup(GroupEO group) {
        this.group = group;
    }
}
