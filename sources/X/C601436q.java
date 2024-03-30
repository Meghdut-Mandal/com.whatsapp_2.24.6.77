package X;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;

/* renamed from: X.36q  reason: invalid class name and case insensitive filesystem */
public final class C601436q {
    public final Intent A00;
    public final Drawable A01;
    public final CharSequence A02;

    public C601436q(Intent intent, ActivityInfo activityInfo, Drawable drawable, CharSequence charSequence) {
        AnonymousClass00C.A0D(intent, 1);
        Intent intent2 = new Intent(intent);
        C36421kH.A0o(intent2, activityInfo.packageName, activityInfo.name);
        this.A00 = intent2;
        this.A01 = drawable;
        this.A02 = charSequence;
    }
}
