package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0wa  reason: invalid class name and case insensitive filesystem */
public class C19830wa implements ThreadFactory {
    public final int A00;
    public final String A01;
    public final AtomicInteger A02 = new AtomicInteger(1);

    public Thread newThread(Runnable runnable) {
        C35771jE r2 = new C35771jE(this, runnable, 21);
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append(" #");
        sb.append(this.A02.getAndIncrement());
        C19950wm r1 = new C19950wm(r2, sb.toString());
        Boolean bool = C18750th.A03;
        return r1;
    }

    public C19830wa(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
