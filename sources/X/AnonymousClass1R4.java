package X;

import android.app.Activity;
import android.graphics.Rect;

/* renamed from: X.1R4  reason: invalid class name */
public abstract class AnonymousClass1R4 {
    public static final Rect A00(Activity activity) {
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        AnonymousClass00C.A08(bounds);
        return bounds;
    }
}
