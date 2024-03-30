package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.77G  reason: invalid class name */
public final /* synthetic */ class AnonymousClass77G implements ThreadFactory {
    public final /* synthetic */ String A00;

    public /* synthetic */ AnonymousClass77G(String str) {
        this.A00 = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.A00;
        Executor executor = C19780wV.A07;
        return new C19950wm(runnable, str);
    }
}
