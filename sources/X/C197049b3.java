package X;

import android.os.Trace;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.9b3  reason: invalid class name and case insensitive filesystem */
public abstract class C197049b3 {
    public static final long A00;
    public static final Method A01;
    public static final Method A02;
    public static volatile boolean A03 = true;

    static {
        Class<Trace> cls = Trace.class;
        try {
            Method A0G = AnonymousClass001.A0G(cls, Long.TYPE, "isTagEnabled", new Class[1], 0);
            Method A0G2 = AnonymousClass001.A0G(cls, Boolean.TYPE, "setAppTracingAllowed", new Class[1], 0);
            Field field = cls.getField("TRACE_TAG_APP");
            if (field.getType() == Long.TYPE) {
                AnonymousClass9J6 r1 = new AnonymousClass9J6(A0G, A0G2, field.getLong((Object) null));
                A01 = r1.A01;
                A02 = r1.A02;
                A00 = r1.A00;
            }
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException unused) {
        }
    }

    public static Object A00(Method method, Object... objArr) {
        try {
            return method.invoke((Object) null, objArr);
        } catch (IllegalAccessException unused) {
            A03 = false;
            return null;
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (!(targetException instanceof RuntimeException) && !(targetException instanceof Error)) {
                return null;
            }
            throw targetException;
        }
    }
}
