package com.facebook.quicklog.reliability;

import X.AnonymousClass000;

public class UserFlowJNIProvider {
    public static UserFlowLogger mUserFlowLogger;

    public static synchronized boolean isInitialized() {
        boolean A1V;
        synchronized (UserFlowJNIProvider.class) {
            A1V = AnonymousClass000.A1V(mUserFlowLogger);
        }
        return A1V;
    }

    public static synchronized void setUserFlowLogger(UserFlowLogger userFlowLogger) {
        synchronized (UserFlowJNIProvider.class) {
            mUserFlowLogger = userFlowLogger;
        }
    }

    public static UserFlowLogger getUserFlowInstance() {
        return mUserFlowLogger;
    }
}
