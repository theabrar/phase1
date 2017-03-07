package test;

import beans.GetBeanGlobal;
import beans.GetBeanStartSession;

public class TestInitialization {

	public void startSession() {
		GetBeanGlobal.GetGlobalBean();
		GetBeanStartSession.startSessionBean();
	}

	public void closeSession() {
		GetBeanStartSession.driver().quit();
	}
}
