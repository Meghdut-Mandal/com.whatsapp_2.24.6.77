package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;

/* renamed from: X.6Gj  reason: invalid class name and case insensitive filesystem */
public abstract class C129306Gj {
    public static Activity A00(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return A00(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static List A01(Activity activity) {
        if (activity instanceof AnonymousClass01I) {
            return ((AnonymousClass01I) activity).getSupportFragmentManager().A0T.A04();
        }
        return null;
    }
}
