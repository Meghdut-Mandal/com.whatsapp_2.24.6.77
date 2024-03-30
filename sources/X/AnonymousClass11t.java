package X;

import java.security.AccessController;

/* renamed from: X.11t  reason: invalid class name */
public abstract class AnonymousClass11t {
    public static Class A00(String str, Class cls) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new AXC(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
