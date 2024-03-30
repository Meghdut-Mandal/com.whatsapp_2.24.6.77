package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: X.1vS  reason: invalid class name and case insensitive filesystem */
public final class C40381vS extends AnonymousClass0IE {
    public final C18820ts A00;

    public float A06(DisplayMetrics displayMetrics) {
        if (displayMetrics != null) {
            return 75.0f / ((float) displayMetrics.densityDpi);
        }
        throw AnonymousClass001.A0A("densityDpi");
    }

    public int A07() {
        if (C36401kF.A1X(this.A00)) {
            return 1;
        }
        return -1;
    }

    public int A08() {
        if (C36401kF.A1X(this.A00)) {
            return 1;
        }
        return -1;
    }

    public C40381vS(Context context, C18820ts r2) {
        super(context);
        this.A00 = r2;
    }
}
