package X;

import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: X.6Fw  reason: invalid class name and case insensitive filesystem */
public abstract class C129216Fw {
    public static final float A00(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AnonymousClass6QQ.A00(edgeEffect);
        }
        return 0.0f;
    }

    public static final float A01(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AnonymousClass6QQ.A01(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }
}
