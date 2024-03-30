package X;

/* renamed from: X.6Qp  reason: invalid class name and case insensitive filesystem */
public abstract class C131786Qp {
    public static final void A00(C1271967i r3, C140456lc r4, C98114qt r5, C118885ot r6) {
        if (r4.A0W(68) != null) {
            int i = r6.A00;
            C140456lc A0W = r4.A0W(68);
            if (A0W != null) {
                i = AnonymousClass5Z8.A01(r3, A0W, i);
            }
            r5.setOutlineAmbientShadowColor(i);
        }
        if (r4.A0W(69) != null) {
            int i2 = r6.A01;
            C140456lc A0W2 = r4.A0W(69);
            if (A0W2 != null) {
                i2 = AnonymousClass5Z8.A01(r3, A0W2, i2);
            }
            r5.setOutlineSpotShadowColor(i2);
        }
    }

    public static final void A02(C98114qt r1, C118885ot r2) {
        r1.setOutlineAmbientShadowColor(r2.A00);
        r1.setOutlineSpotShadowColor(r2.A01);
    }

    public static final void A01(C98114qt r1, C118885ot r2) {
        r2.A00 = r1.getOutlineAmbientShadowColor();
        r2.A01 = r1.getOutlineSpotShadowColor();
    }
}
