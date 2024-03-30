package X;

import android.content.Context;
import android.content.res.TypedArray;

/* renamed from: X.3NG  reason: invalid class name */
public final class AnonymousClass3NG {
    public final AnonymousClass3AO A00;

    public AnonymousClass3NG(Context context, int i) {
        C61253Bd r0;
        AnonymousClass3AO r2 = new AnonymousClass3AO();
        this.A00 = r2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C27991Qq.A03);
        int i2 = obtainStyledAttributes.getInt(2, -1);
        if (i2 == 0) {
            r0 = C50772lY.A00;
        } else if (i2 != 1) {
            if (i2 == 2) {
                r0 = new C50792la(AnonymousClass4IL.A00);
            }
            r2.A06 = obtainStyledAttributes.getBoolean(3, false);
            r2.A02 = obtainStyledAttributes.getDimensionPixelSize(1, -1);
            r2.A01 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            obtainStyledAttributes.recycle();
        } else {
            r0 = C50782lZ.A00;
        }
        r2.A04 = r0;
        r2.A06 = obtainStyledAttributes.getBoolean(3, false);
        r2.A02 = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        r2.A01 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
    }

    public AnonymousClass3NG() {
        this.A00 = new AnonymousClass3AO();
    }
}
