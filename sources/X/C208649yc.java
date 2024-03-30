package X;

import android.graphics.PointF;

/* renamed from: X.9yc  reason: invalid class name and case insensitive filesystem */
public class C208649yc implements C22855Ax5 {
    public static final C208649yc A00 = new C208649yc();

    public /* bridge */ /* synthetic */ Object BlD(C21655ATw aTw, float f) {
        Integer A0H = aTw.A0H();
        if (A0H == C023109s.A00 || A0H == C023109s.A0C) {
            return C202379li.A02(aTw, f);
        }
        if (A0H == C023109s.A0V) {
            PointF pointF = new PointF(C21655ATw.A08(aTw) * f, C21655ATw.A08(aTw) * f);
            while (aTw.A0S()) {
                aTw.A0Q();
            }
            return pointF;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Cannot convert json to point. Next token is ");
        throw AnonymousClass000.A0c(AnonymousClass93X.A00(A0H), A0u);
    }
}
