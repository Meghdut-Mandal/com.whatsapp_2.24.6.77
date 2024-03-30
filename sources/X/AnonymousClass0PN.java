package X;

import android.app.Dialog;
import android.os.Build;
import android.view.View;

/* renamed from: X.0PN  reason: invalid class name */
public abstract class AnonymousClass0PN {
    public static View A00(Dialog dialog, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AnonymousClass0PM.A00(dialog, i);
        }
        View findViewById = dialog.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw AnonymousClass001.A08("ID does not reference a View inside this Dialog");
    }
}
