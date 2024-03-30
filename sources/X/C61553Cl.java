package X;

import android.content.Context;
import android.provider.Settings;

/* renamed from: X.3Cl  reason: invalid class name and case insensitive filesystem */
public final class C61553Cl {
    public final C20810yC A00;

    public C61553Cl(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final boolean A00(Context context) {
        if (Settings.System.getFloat(context.getContentResolver(), "font_scale", 1.0f) >= 1.5f || !this.A00.A0E(7686)) {
            return false;
        }
        return true;
    }
}
