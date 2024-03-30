package X;

import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build;

/* renamed from: X.0Qb  reason: invalid class name and case insensitive filesystem */
public abstract class C05530Qb {
    public static void A00(Outline outline, Path path) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            outline.setPath(path);
        } else if (i >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }
}
