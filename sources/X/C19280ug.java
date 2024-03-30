package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.0ug  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C19280ug implements ThreadFactory {
    public static final ThreadFactory A00 = new C19280ug();

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
