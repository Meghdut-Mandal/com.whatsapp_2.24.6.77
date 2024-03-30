package X;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.0Rb  reason: invalid class name and case insensitive filesystem */
public abstract class C05790Rb {
    public static final Method A00;

    static {
        Method method;
        Class<ScheduledThreadPoolExecutor> cls = ScheduledThreadPoolExecutor.class;
        try {
            method = AnonymousClass001.A0G(cls, Boolean.TYPE, "setRemoveOnCancelPolicy", new Class[1], 0);
        } catch (Throwable unused) {
            method = null;
        }
        A00 = method;
    }
}
