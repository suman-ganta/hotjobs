package hotjobs.profile.eo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * CREATE TABLE `USERPROFILE` (
  `PROFILEID` int(11) NOT NULL,
  `USERID` varchar(45) DEFAULT NULL,
  `SUMMARY` varchar(45) DEFAULT NULL,
  `SKILLRANK` int(11) DEFAULT NULL,
  `RELIABILITYRANK` int(11) DEFAULT NULL,
  `ZIPCODE` varchar(10) DEFAULT NULL,
  `SERVICEADDESS` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`PROFILEID`)
)
 */
@Entity
@Table (name = "USERPROFILE")
public class UserProfileEO {
    @Id
    private Integer profileId;
    private String userId;
    @Column(name = "SUMMARY")
    private String profileSummary;
    
    private Integer skillRank;
    private Integer reliabilityRank;
    
    private String zipcode; //zipcode can have characters for some countries.
    
    private String serviceAddress;
    /**
     * @return the profileId
     */
    public Integer getProfileId() {
        return profileId;
    }

    /**
     * @param profileId the profileId to set
     */
    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

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
     * @return the profileSummary
     */
    public String getProfileSummary() {
        return profileSummary;
    }

    /**
     * @param profileSummary the profileSummary to set
     */
    public void setProfileSummary(String profileSummary) {
        this.profileSummary = profileSummary;
    }

    /**
     * @return the skillRank
     */
    public Integer getSkillRank() {
        return skillRank;
    }

    /**
     * @param skillRank the skillRank to set
     */
    public void setSkillRank(Integer skillRank) {
        this.skillRank = skillRank;
    }

    /**
     * @return the reliabilityRank
     */
    public Integer getReliabilityRank() {
        return reliabilityRank;
    }

    /**
     * @param reliabilityRank the reliabilityRank to set
     */
    public void setReliabilityRank(Integer reliabilityRank) {
        this.reliabilityRank = reliabilityRank;
    }

    /**
     * @return the zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * @param zipcode the zipcode to set
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * @return the serviceAddress
     */
    public String getServiceAddress() {
        return serviceAddress;
    }

    /**
     * @param serviceAddress the serviceAddress to set
     */
    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

}
