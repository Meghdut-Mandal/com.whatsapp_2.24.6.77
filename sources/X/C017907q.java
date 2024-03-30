package X;

import android.graphics.Path;
import android.view.animation.PathInterpolator;

/* renamed from: X.07q  reason: invalid class name and case insensitive filesystem */
public abstract class C017907q {
    public static PathInterpolator A00(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }

    public static PathInterpolator A01(Path path) {
        return new PathInterpolator(path);
    }
}
