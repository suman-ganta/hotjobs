package hotjobs.groups.eo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GROUP")
public class GroupEO {
/*
 * CREATE TABLE `GROUP` (
  `GROUPID` int(11) NOT NULL,
  `NAME` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`GROUPID`)
) 
 */
    @Id
    private Integer groupId;
    private String name;
}
