package X;

import android.graphics.Color;

/* renamed from: X.9yY  reason: invalid class name and case insensitive filesystem */
public class C208619yY implements C22855Ax5 {
    public static final C208619yY A00 = new C208619yY();

    public /* bridge */ /* synthetic */ Object BlD(C21655ATw aTw, float f) {
        double d;
        boolean z = false;
        if (aTw.A0H() == C023109s.A00) {
            z = true;
            aTw.A0L();
        }
        double A0D = aTw.A0D();
        double A0D2 = aTw.A0D();
        double A0D3 = aTw.A0D();
        if (aTw.A0H() == C023109s.A0V) {
            d = aTw.A0D();
        } else {
            d = 1.0d;
        }
        if (z) {
            aTw.A0N();
        }
        if (A0D <= 1.0d && A0D2 <= 1.0d && A0D3 <= 1.0d) {
            A0D *= 255.0d;
            A0D2 *= 255.0d;
            A0D3 *= 255.0d;
            if (d <= 1.0d) {
                d *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d, (int) A0D, (int) A0D2, (int) A0D3));
    }
}
