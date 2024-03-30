package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.3xn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C81883xn implements ThreadFactory {
    public static final /* synthetic */ C81883xn A00 = new C81883xn();

    public final Thread newThread(Runnable runnable) {
        return new C19950wm(new C35731jA((Object) runnable, 16), "DecryptMessageExecutor");
    }
}
