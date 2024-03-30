package X;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0Rk  reason: invalid class name and case insensitive filesystem */
public abstract class C05880Rk {
    public static long A00;
    public static Method A01;

    public static boolean A00() {
        try {
            if (A01 == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            Method method = A01;
            if (method == null) {
                Class<Trace> cls = Trace.class;
                A00 = cls.getField("TRACE_TAG_APP").getLong((Object) null);
                method = AnonymousClass001.A0G(cls, Long.TYPE, "isTagEnabled", new Class[1], 0);
                A01 = method;
            }
            Object[] objArr = new Object[1];
            AnonymousClass000.A1M(objArr, 0, A00);
            return AnonymousClass000.A1Y((Object) null, method, objArr);
        } catch (Exception e) {
            if (e instanceof InvocationTargetException) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw cause;
                }
                throw AnonymousClass001.A0B(cause);
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Unable to call ");
            A0u.append("isTagEnabled");
            Log.v("Trace", AnonymousClass000.A0q(" via reflection", A0u), e);
            return false;
        }
    }
}
