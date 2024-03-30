package X;

import java.util.List;

/* renamed from: X.3g2  reason: invalid class name and case insensitive filesystem */
public class C70983g2 implements AnonymousClass4Q7 {
    public final AnonymousClass171 A00;
    public final AnonymousClass1A5 A01;
    public final List A02;
    public final boolean A03;

    public C70983g2(AnonymousClass171 r3, AnonymousClass1A5 r4, C230116v r5, List list) {
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = list;
        this.A03 = r5.A01.A0E(3751);
    }

    public boolean B7L(AnonymousClass11F r6) {
        AnonymousClass141 r3;
        if ((!AnonymousClass143.A0I(r6) || this.A03) && (r3 = (AnonymousClass141) this.A01.A04().get(r6)) != null && !(r3.A0H instanceof AnonymousClass146) && this.A00.A0h(r3, this.A02, true)) {
            return true;
        }
        return false;
    }
}
