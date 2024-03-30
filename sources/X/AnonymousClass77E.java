package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.77E  reason: invalid class name */
public class AnonymousClass77E implements ThreadFactory {
    public final /* synthetic */ String A00;

    public AnonymousClass77E(String str) {
        this.A00 = str;
    }

    public Thread newThread(Runnable runnable) {
        return new AnonymousClass78d(runnable, this.A00);
    }
}
