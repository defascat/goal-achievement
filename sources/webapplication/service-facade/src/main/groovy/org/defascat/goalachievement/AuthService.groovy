package org.defascat.goalachievement

interface AuthService {
	/**
	 * Checks whether the app is initialized.
	 * @return true - if at least one user exists in the system.
	 */
	boolean isInitialized();
}