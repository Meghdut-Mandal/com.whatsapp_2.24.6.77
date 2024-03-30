package com.facebook.soloader;

import X.AnonymousClass000;
import X.C90524aI;
import dalvik.system.BaseDexClassLoader;

public class SysUtil$Api14Utils {
    public static String A00() {
        ClassLoader classLoader = SoLoader.class.getClassLoader();
        if (classLoader == null || (classLoader instanceof BaseDexClassLoader)) {
            try {
                return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
            } catch (Exception e) {
                throw C90524aI.A0e("Cannot call getLdLibraryPath", e);
            }
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("ClassLoader ");
            A0u.append(AnonymousClass000.A0k(classLoader));
            throw AnonymousClass000.A0g(" should be of type BaseDexClassLoader", A0u);
        }
    }
}
