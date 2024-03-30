package X;

import java.util.AbstractMap;

/* renamed from: X.66L  reason: invalid class name */
public final class AnonymousClass66L {
    public final C132396Tl A00;
    public final AnonymousClass00T A01 = C36431kI.A1I(new AnonymousClass7LA(this));

    public AnonymousClass66L(C132396Tl r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final void A00(String str) {
        AnonymousClass00C.A0D(str, 0);
        ((AbstractMap) this.A01.getValue()).remove(str);
    }
}
