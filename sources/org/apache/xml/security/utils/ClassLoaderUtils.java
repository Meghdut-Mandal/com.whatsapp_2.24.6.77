package org.apache.xml.security.utils;

import X.C165577te;

public final class ClassLoaderUtils {
    public static Class a;

    public static Class a(String str, Class cls) {
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                return contextClassLoader.loadClass(str);
            }
        } catch (ClassNotFoundException unused) {
        }
        return b(str, cls);
    }

    public static Class b(String str, Class cls) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            try {
                Class cls2 = a;
                if (cls2 == null) {
                    cls2 = a("org.apache.xml.security.utils.ClassLoaderUtils");
                    a = cls2;
                }
                if (cls2.getClassLoader() != null) {
                    Class cls3 = a;
                    if (cls3 == null) {
                        cls3 = a("org.apache.xml.security.utils.ClassLoaderUtils");
                        a = cls3;
                    }
                    return cls3.getClassLoader().loadClass(str);
                }
            } catch (ClassNotFoundException unused) {
                if (!(cls == null || cls.getClassLoader() == null)) {
                    return cls.getClassLoader().loadClass(str);
                }
            }
            throw e;
        }
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw C165577te.A0m(e);
        }
    }
}
