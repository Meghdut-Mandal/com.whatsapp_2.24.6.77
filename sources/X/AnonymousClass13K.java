package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: X.13K  reason: invalid class name */
public final class AnonymousClass13K implements AnonymousClass13J {
    public final PackageManager A00;
    public final C19730wQ A01;
    public final C20810yC A02;
    public final AnonymousClass00T A03;
    public final AnonymousClass00T A04;

    public AnonymousClass13K(Context context, C19730wQ r4, C20810yC r5) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r4, 3);
        this.A02 = r5;
        this.A01 = r4;
        this.A00 = context.getPackageManager();
        C000800j r1 = C000800j.PUBLICATION;
        this.A03 = C001400p.A00(r1, new AnonymousClass13L(this));
        this.A04 = C001400p.A00(r1, new AnonymousClass13M(this));
    }

    public boolean BJo() {
        return ((Boolean) this.A03.getValue()).booleanValue();
    }

    public boolean BLK() {
        if (C20800yB.A00(C21000yV.A02, this.A02, 6598) <= 0 || Build.VERSION.SDK_INT < 29) {
            return false;
        }
        return true;
    }

    public boolean BMU() {
        if (C20800yB.A00(C21000yV.A02, this.A02, 3510) < 1) {
            return false;
        }
        return true;
    }

    public boolean BN6() {
        if (C20800yB.A00(C21000yV.A02, this.A02, 3171) < 1) {
            return false;
        }
        return true;
    }
}
