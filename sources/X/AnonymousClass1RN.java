package X;

import java.util.HashMap;

/* renamed from: X.1RN  reason: invalid class name */
public final class AnonymousClass1RN implements AnonymousClass1RM {
    public final C19770wU A00;
    public final HashMap A01;
    public final boolean A02;

    public AnonymousClass1RN(C19770wU r2, HashMap hashMap, boolean z) {
        AnonymousClass00C.A0D(hashMap, 2);
        this.A00 = r2;
        this.A01 = hashMap;
        this.A02 = z;
    }

    public void B6e(AnonymousClass1RT r5) {
        boolean z = this.A02;
        String str = r5.A05;
        C19770wU r2 = this.A00;
        if (z) {
            if (str != null) {
                r2.Boz(new C35721j9(this, r5, 28), str);
            } else {
                r2.Boy(new C35721j9(this, r5, 30));
            }
        } else if (str != null) {
            r2.Bp2(new C35721j9(this, r5, 29), str);
        } else {
            r2.Bp1(new C35721j9(this, r5, 27));
        }
    }
}
