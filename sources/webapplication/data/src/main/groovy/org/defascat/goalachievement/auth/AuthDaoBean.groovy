package org.defascat.goalachievement.auth

import org.defascat.goalachievement.BasicDaoBean;
import org.defascat.goalachievement.EMF;

class AuthDaoBean extends BasicDaoBean implements AuthDao {
	@Override
	public int getUserCount() {
		executeQuery("select from UserAccount as UserAccount", {ct -> ct.size()});
	}
}
