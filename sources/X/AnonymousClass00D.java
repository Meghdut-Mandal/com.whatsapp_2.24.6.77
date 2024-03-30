package X;

import android.content.Context;
import android.os.UserManager;

/* renamed from: X.00D  reason: invalid class name */
public abstract class AnonymousClass00D {
    public static boolean A00(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
