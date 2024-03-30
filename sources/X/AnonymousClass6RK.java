package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.6RK  reason: invalid class name */
public final class AnonymousClass6RK {
    public static final AnonymousClass6RK A00 = new AnonymousClass6RK();

    public static final Activity A00(Context context, AnonymousClass6RK r2) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        AnonymousClass00C.A08(baseContext);
        return A00(baseContext, r2);
    }
}
