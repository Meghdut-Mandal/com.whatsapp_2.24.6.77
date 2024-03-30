package X;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.6UT  reason: invalid class name */
public class AnonymousClass6UT {
    public static final Set A00 = Collections.synchronizedSet(C36441kJ.A16());

    public static void A01(C20810yC r5) {
        if (r5.A0E(3663)) {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                if (!(stackTraceElement == null || stackTraceElement.getClass() == null)) {
                    A00.add(stackTraceElement.getClassName());
                }
            }
        }
    }

    public static Object A00(Object obj, String str) {
        Class cls = obj.getClass();
        Class cls2 = cls;
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Unable to find field ");
        A0u.append(str);
        throw new NoSuchFieldException(AnonymousClass000.A0l(cls2, " in ", A0u));
    }
}
