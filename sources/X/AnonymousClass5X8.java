package X;

import java.util.Arrays;

/* renamed from: X.5X8  reason: invalid class name */
public abstract class AnonymousClass5X8 {
    public static final String A00(Object obj) {
        String simpleName;
        Class<?> cls = obj.getClass();
        if (cls.isAnonymousClass()) {
            simpleName = cls.getName();
        } else {
            simpleName = cls.getSimpleName();
        }
        StringBuilder A0v = AnonymousClass000.A0v(simpleName);
        A0v.append('@');
        Object[] objArr = new Object[1];
        AnonymousClass000.A1L(objArr, System.identityHashCode(obj), 0);
        return AnonymousClass000.A0q(C90504aG.A0m("%07x", Arrays.copyOf(objArr, 1)), A0v);
    }
}
