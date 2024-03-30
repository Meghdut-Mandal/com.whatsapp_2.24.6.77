package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0wM  reason: invalid class name and case insensitive filesystem */
public class C19690wM implements C19680wL {
    public final AtomicReference A00 = new AtomicReference("D");

    public C19690wM(C19600wD r3) {
        r3.registerObserver(this);
    }

    public void BUP(AnonymousClass3K7 r3) {
        String str = "D";
        if (r3.A02) {
            if (r3.A03) {
                str = "M";
            } else if (r3.A05) {
                str = "W";
            }
        }
        this.A00.set(str);
    }
}
