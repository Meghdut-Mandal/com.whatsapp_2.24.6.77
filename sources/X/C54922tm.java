package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.2tm  reason: invalid class name and case insensitive filesystem */
public abstract class C54922tm {
    public static final void A00(Context context, Intent intent) {
        PendingIntent A01 = C65743Th.A01(context, 0, intent, 0);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = AnonymousClass001.A07();
        }
        extras.putParcelable("_ci_", A01);
        intent.putExtras(extras);
    }
}
