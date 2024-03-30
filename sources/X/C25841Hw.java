package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Point;

/* renamed from: X.1Hw  reason: invalid class name and case insensitive filesystem */
public final class C25841Hw {
    public final Context A00;
    public final PackageManager A01;
    public final C19420v0 A02;

    public C25841Hw(Context context, C19420v0 r3) {
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = context;
        this.A02 = r3;
        this.A01 = context.getPackageManager();
    }

    public final boolean A02() {
        if (C25961Ii.A00(this.A00) >= 600) {
            return true;
        }
        return false;
    }

    public final boolean A00() {
        if (!A01() || A02()) {
            return false;
        }
        return true;
    }

    public final boolean A01() {
        int i;
        boolean z = false;
        if ((C19550w8.A07() && this.A01.hasSystemFeature("android.hardware.sensor.hinge_angle")) || ((SharedPreferences) this.A02.A00.get()).getBoolean("detect_device_foldable", false)) {
            z = true;
            Point A012 = C25961Ii.A01(this.A00);
            if (A012 != null) {
                int i2 = A012.x;
                int i3 = A012.y;
                int i4 = i2;
                if (i2 > i3) {
                    i4 = i3;
                }
                if (i2 < i3) {
                    i2 = i3;
                }
                C19420v0 r7 = this.A02;
                Point A0W = r7.A0W(Integer.MIN_VALUE);
                Point A0X = r7.A0X(Integer.MAX_VALUE);
                int i5 = A0X.x;
                boolean z2 = false;
                if (i5 != Integer.MIN_VALUE) {
                    z2 = true;
                }
                int i6 = A0W.x;
                if (i6 < i4) {
                    i6 = i4;
                }
                int i7 = A0W.y;
                if (i7 < i2) {
                    i7 = i2;
                }
                if (i5 > i4) {
                    i5 = i4;
                }
                int i8 = A0X.y;
                if (i8 > i2) {
                    i8 = i2;
                }
                int i9 = i;
                if (z2) {
                    int i10 = i6;
                    if (i6 < i5) {
                        i10 = i5;
                    }
                    i6 = i10;
                    if (i10 > i5) {
                        i10 = i5;
                    }
                    i5 = i10;
                    i = i7;
                    if (i7 < i9) {
                        i = i9;
                    }
                    i7 = i;
                    if (i > i9) {
                        i = i9;
                    }
                }
                SharedPreferences.Editor A002 = C19420v0.A00(r7);
                A002.putInt("foldable_max_display_width", i6);
                A002.putInt("foldable_max_display_height", i7);
                A002.apply();
                SharedPreferences.Editor A003 = C19420v0.A00(r7);
                A003.putInt("foldable_min_display_width", i5);
                A003.putInt("foldable_min_display_height", i);
                A003.apply();
            }
        }
        return z;
    }
}
