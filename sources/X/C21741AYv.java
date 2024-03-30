package X;

import java.util.Objects;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.AYv  reason: case insensitive filesystem */
public class C21741AYv implements ThreadFactory {
    public final int A00;
    public final String A01;
    public final AnonymousClass004 A02;

    public Thread newThread(Runnable runnable) {
        int i = this.A00;
        if (i != 0) {
            runnable = new C81283wl((Object) runnable, i, 6);
        }
        String str = this.A01;
        if (str == null) {
            AnonymousClass004 r0 = this.A02;
            Objects.requireNonNull(r0);
            str = (String) r0.get();
        }
        return new Thread(runnable, str);
    }

    public C21741AYv(AnonymousClass004 r2, int i) {
        this.A01 = null;
        this.A02 = r2;
        this.A00 = i;
    }

    public C21741AYv(String str, int i) {
        this.A01 = str;
        this.A02 = null;
        this.A00 = i;
    }
}
