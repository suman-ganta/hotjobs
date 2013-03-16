package hotjobs.user;


/*
 * `USERID` varchar(50) NOT NULL,
  `PASSWORDHASH` varchar(500) DEFAULT NULL,
  `DISPLAYNAME` varchar(500) DEFAULT NULL,
  `EMAIL` varchar(500) DEFAULT NULL,
  `COUNTRY` varchar(45) DEFAULT NULL,
  `ROLE` int(11) DEFAULT NULL,
  `GROUPID` int(11) DEFAULT NULL,
 */
public interface IUser {
    String getId();
    void setId(String userId);
    String getDisplayName();
    void setDisplayName(String displayName);
    String getEmail();
    void setEmail(String email);
    String getCountry();
    void setCountry(String country);
}
