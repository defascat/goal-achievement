package org.defascat.goalachievement

import org.defascat.goalachievement.auth.AuthDao;
import org.defascat.goalachievement.auth.UserAccount;

class AuthServiceBean implements AuthService {
	@Override
	public boolean isInitialized() {
		AuthDao dao = ServiceInjector.currentInjector.getInstance(AuthDao)
		return dao.userCount != 0;
	}
}
