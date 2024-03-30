package X;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* renamed from: X.9li  reason: invalid class name and case insensitive filesystem */
public abstract class C202379li {
    public static final C197499bo A00 = C197499bo.A00("x", "y");

    public static float A00(C21655ATw aTw) {
        Integer A0H = aTw.A0H();
        int intValue = A0H.intValue();
        if (intValue == 6) {
            return C21655ATw.A08(aTw);
        }
        if (intValue == 0) {
            aTw.A0L();
            float A08 = C21655ATw.A08(aTw);
            while (aTw.A0S()) {
                aTw.A0Q();
            }
            aTw.A0N();
            return A08;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Unknown value for token of type ");
        throw AnonymousClass000.A0c(AnonymousClass93X.A00(A0H), A0u);
    }

    public static int A01(C21655ATw aTw) {
        aTw.A0L();
        int A0D = (int) (aTw.A0D() * 255.0d);
        int A0D2 = (int) (aTw.A0D() * 255.0d);
        int A0D3 = (int) (aTw.A0D() * 255.0d);
        while (aTw.A0S()) {
            aTw.A0Q();
        }
        aTw.A0N();
        return Color.argb(255, A0D, A0D2, A0D3);
    }

    public static PointF A02(C21655ATw aTw, float f) {
        float f2;
        float f3;
        int intValue = aTw.A0H().intValue();
        if (intValue != 6) {
            if (intValue == 0) {
                aTw.A0L();
                f2 = C21655ATw.A08(aTw);
                f3 = C21655ATw.A08(aTw);
                while (aTw.A0H() != C023109s.A01) {
                    aTw.A0Q();
                }
                aTw.A0N();
            } else if (intValue == 2) {
                aTw.A0M();
                f2 = 0.0f;
                f3 = 0.0f;
                while (aTw.A0S()) {
                    int A0F = aTw.A0F(A00);
                    if (A0F == 0) {
                        f2 = A00(aTw);
                    } else if (A0F != 1) {
                        aTw.A0P();
                        aTw.A0Q();
                    } else {
                        f3 = A00(aTw);
                    }
                }
                aTw.A0O();
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Unknown point starts with ");
                throw AnonymousClass000.A0c(AnonymousClass93X.A00(aTw.A0H()), A0u);
            }
            return new PointF(f2 * f, f3 * f);
        }
        float A08 = C21655ATw.A08(aTw);
        float A082 = C21655ATw.A08(aTw);
        while (aTw.A0S()) {
            aTw.A0Q();
        }
        return new PointF(A08 * f, A082 * f);
    }

    public static ArrayList A03(C21655ATw aTw, float f) {
        ArrayList A0I = AnonymousClass001.A0I();
        aTw.A0L();
        while (aTw.A0H() == C023109s.A00) {
            aTw.A0L();
            A0I.add(A02(aTw, f));
            aTw.A0N();
        }
        aTw.A0N();
        return A0I;
    }
}
