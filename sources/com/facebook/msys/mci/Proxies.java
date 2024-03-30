package com.facebook.msys.mci;

public class Proxies {
    public static boolean sConfigured;

    public static native void configureInternal(ProxyProvider proxyProvider);

    public static boolean isMCPEnabledForProxies(int i) {
        if (i == 0 || i == 1 || i == 3 || i == 4 || i == 5 || i == 9 || i == 10 || i == 15 || i == 16) {
            return true;
        }
        return false;
    }

    public static synchronized void configure(ProxyProvider proxyProvider) {
        synchronized (Proxies.class) {
            if (!sConfigured) {
                sConfigured = true;
                configureInternal(proxyProvider);
            } else {
                throw new IllegalStateException();
            }
        }
    }
}
