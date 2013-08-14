package org.defascat.goalachievement.auth

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

@Entity
class UserAccount {
	@Id String username
}
