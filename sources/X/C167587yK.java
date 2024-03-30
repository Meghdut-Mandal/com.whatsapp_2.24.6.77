package X;

import java.util.Objects;

/* renamed from: X.7yK  reason: invalid class name and case insensitive filesystem */
public final class C167587yK extends AnonymousClass04R {
    public final C193529Lv A00;
    public final AnonymousClass9F9 A01;
    public final String A02;

    public C167587yK(AnonymousClass9F9 r3, String str) {
        C193529Lv r1;
        AnonymousClass00C.A0D(r3, 1);
        this.A01 = r3;
        this.A02 = str;
        synchronized (r3) {
            r1 = (C193529Lv) r3.A00.get(str);
        }
        Objects.requireNonNull(r1, "No observer attached to the given FDS Manager ID");
        this.A00 = r1;
    }

    public void A0R() {
        AnonymousClass9F9 r2 = this.A01;
        String str = this.A02;
        synchronized (r2) {
            r2.A00.remove(str);
        }
        C193529Lv r0 = this.A00;
        r0.A03.unregisterObserver(r0.A02);
    }
}
