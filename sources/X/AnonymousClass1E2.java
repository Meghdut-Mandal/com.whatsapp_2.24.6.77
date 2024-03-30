package X;

import android.graphics.Rect;

/* renamed from: X.1E2  reason: invalid class name */
public final class AnonymousClass1E2 {
    public final C20810yC A00;
    public final C21060yb A01;
    public final C19890wg A02;

    public AnonymousClass1E2(C21060yb r2, C20810yC r3, C19890wg r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A00 = r3;
        this.A01 = r2;
        this.A02 = r4;
    }

    public final boolean A02(C65013Qj r6) {
        AnonymousClass00C.A0D(r6, 0);
        int i = r6.A06;
        int i2 = r6.A0A;
        int max = Math.max(i, i2);
        int min = Math.min(i, i2);
        C20810yC r2 = this.A00;
        C21000yV r1 = C21000yV.A02;
        if (min >= C20800yB.A00(r1, r2, 4171)) {
            return true;
        }
        if (max <= C20800yB.A00(r1, r2, 4172) || min < C20800yB.A00(r1, r2, 4175)) {
            return false;
        }
        return true;
    }

    public final boolean A00() {
        int A022 = AnonymousClass1K2.A02(this.A01, this.A02);
        C20810yC r2 = this.A00;
        C21000yV r1 = C21000yV.A02;
        if (A022 < C20800yB.A00(r1, r2, 4154) || !C20800yB.A01(r1, r2, 3935)) {
            return false;
        }
        return true;
    }

    public final boolean A01(Rect rect, AnonymousClass011 r7) {
        int max;
        int intValue;
        int intValue2;
        if (rect != null) {
            max = Math.max(rect.height(), rect.width());
            intValue = rect.height();
            intValue2 = rect.width();
        } else {
            max = Math.max(((Number) r7.first).intValue(), ((Number) r7.second).intValue());
            intValue = ((Number) r7.first).intValue();
            intValue2 = ((Number) r7.second).intValue();
        }
        int min = Math.min(intValue, intValue2);
        C20810yC r2 = this.A00;
        C21000yV r1 = C21000yV.A02;
        if (min >= C20800yB.A00(r1, r2, 4171)) {
            return true;
        }
        if (max <= C20800yB.A00(r1, r2, 4172) || min < C20800yB.A00(r1, r2, 4175)) {
            return false;
        }
        return true;
    }
}
