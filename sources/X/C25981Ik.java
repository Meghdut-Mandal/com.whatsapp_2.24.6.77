package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* renamed from: X.1Ik  reason: invalid class name and case insensitive filesystem */
public abstract class C25981Ik {
    public static final Context A00(Context context) {
        AnonymousClass00C.A0D(context, 0);
        Object systemService = context.getSystemService("display");
        AnonymousClass00C.A0E(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        Display display = ((DisplayManager) systemService).getDisplay(0);
        if (display == null) {
            return context;
        }
        Context createDisplayContext = context.createDisplayContext(display);
        AnonymousClass00C.A08(createDisplayContext);
        return createDisplayContext;
    }
}
