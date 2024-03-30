package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.AYu  reason: case insensitive filesystem */
public class C21740AYu implements ThreadFactory {
    public final /* synthetic */ String A00;

    public C21740AYu(String str) {
        this.A00 = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.A00);
        thread.setPriority(3);
        return thread;
    }
}
