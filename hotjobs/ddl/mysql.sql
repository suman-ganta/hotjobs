delimiter $$

CREATE TABLE `GROUP` (
  `GROUPID` int(11) NOT NULL,
  `NAME` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`GROUPID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='This table represents a company having workers in various skillsets. Company registers itself and adds its members. Timeslot availability of this company is shown as a whole to the end user. when a timeslot is picked up, system automatically picks up an existing timeslot of a group member.'$$


CREATE TABLE `PROFILESKILL` (
  `SKILLID` int(11) NOT NULL,
  `SKILLLEVEL` varchar(45) DEFAULT NULL,
  `DESCRIPTION` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`SKILLID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='This table holds skill info for a profile. All are profile owner entered values.'$$


CREATE TABLE `QUOTEHISTORY` (
  `REQUESTID` int(11) NOT NULL,
  `comment` varchar(45) DEFAULT NULL,
  `attachment` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`REQUESTID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Captures conversations between two parties in finalizing quote'$$

CREATE TABLE `SKILLPRICING` (
  `SKILLID` varchar(45) NOT NULL,
  `AVERAGEPRICE` int(11) DEFAULT NULL,
  PRIMARY KEY (`SKILLID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='This table captures the average price of each skill in the industry. avg pricing is computed based on the accepted prices of the time slots which are COMPLETED. This an interesting number for both the parties, and can be considered as premium edition feature.'$$

CREATE TABLE `TIMESLOT` (
  `USERID` varchar(50) NOT NULL,
  `STARTTIME` datetime DEFAULT NULL,
  `ENDTIME` datetime DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  `CONSUMERID` varchar(50) DEFAULT NULL,
  `SLOTID` int(11) NOT NULL,
  `PROPOSEDPRICE` int(11) DEFAULT NULL,
  `PRICETYPE` int(11) DEFAULT NULL,
  `PRICEUNITS` int(11) DEFAULT NULL,
  `ACCEPTEDPRICE` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`USERID`,`SLOTID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='STATUS - OPEN - Open slot for anyone to grab\n                RESERVED - Booked by some user, but work is not performed yet.\n                COMPLETED - Time slot has been booked and work has been performed successfully\n                CANCELLED - time slot agreed, but cancelled later - it exists here to see if we can treat it as separate case, for things like computing panalty etc.\n\nCONSUMERID - user id of booked user\nPROPOSEDPRICE - slot price initially published to the world\nACCEPTEDPRICE - If price type is negotiable, this is the final price both parties agreed upon.\npriceunits - hourly/daily/weekly/monthly/yearly\npricetype - fixed/negotiable/biddable (biddable will be handled later)\n\nNegotiable price type is generally meant for physical workers who handle varying work types (plumbing etc..) - Here work nature is not fixed. Hence it is highly unlikely that more than one consumer tries to compete for the slot.\n\nBiddable price - biddable price is usually for time slots where work nature is fixed (ex: tutoring) - Here more than one consumer tries to buy a time slot via a bidding process.'$$

CREATE TABLE `TIMESLOTHISTORY` (
  `PERFORMERID` varchar(50) NOT NULL,
  `ACTION` int(11) DEFAULT NULL,
  `OLDVALUE1` varchar(45) DEFAULT NULL,
  `NEWVALUE1` varchar(45) DEFAULT NULL,
  `OLDVALUE2` varchar(45) DEFAULT NULL,
  `NEWVALUE2` varchar(45) DEFAULT NULL,
  `SLOTID` int(11) NOT NULL,
  PRIMARY KEY (`PERFORMERID`,`SLOTID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Two value updates per record\nACTION - STATUSUPDATE\n                SLOT-RANGE-CHANGE\n                DELETE-SLOT'$$


CREATE TABLE `TIMESLOTRESERVATIONREQUEST` (
  `SLOTID` int(11) NOT NULL,
  `REQUESTERID` varchar(45) DEFAULT NULL,
  `PRICEQUOTE` varchar(45) DEFAULT NULL,
  `WORKLOCATION` varchar(45) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  `REQUESTID` int(11) DEFAULT NULL,
  PRIMARY KEY (`SLOTID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='STATUS - QUOTED - initial quote by consumer\n                ACCEPTED - accepted quote\n'$$

CREATE TABLE `USER` (
  `USERID` varchar(50) NOT NULL,
  `PASSWORDHASH` varchar(500) DEFAULT NULL,
  `DISPLAYNAME` varchar(500) DEFAULT NULL,
  `EMAIL` varchar(500) DEFAULT NULL,
  `COUNTRY` varchar(45) DEFAULT NULL,
  `ROLE` int(11) DEFAULT NULL,
  `GROUPID` int(11) DEFAULT NULL,
  PRIMARY KEY (`USERID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Country here is used to determine user locale - for determining currency type for the price value mentioned in time slot.\n\nROLE - GROUPADMIN - administrator of a group, who can add users and associate them to the group.\n            INDIVIDUAL - An individual users who can manage his own time.\n            GROUPMEMBER - A member of a group who has limited previleges on his time slots (TBD)\n\nGROUPID - if this user is part of a group, then this value exists. When this exists, role cannot be ''individual'''$$

CREATE TABLE `USERPROFILE` (
  `PROFILEID` int(11) NOT NULL,
  `USERID` varchar(45) DEFAULT NULL,
  `SUMMARY` varchar(45) DEFAULT NULL,
  `SKILLRANK` int(11) DEFAULT NULL,
  `RELIABILITYRANK` int(11) DEFAULT NULL,
  `ZIPCODE` varchar(10) DEFAULT NULL,
  `SERVICEADDESS` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`PROFILEID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Skill rank will be computed based on customer satisfaction, Reliability rank will be computed once customer "Hires" the technician.'$$
