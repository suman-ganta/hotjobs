package hotjobs.profile;

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
public interface IPersonalDetails {
    Integer getProfileId();
    String getUserId();
    
    String getFirstName();
    String getLastName();
}
