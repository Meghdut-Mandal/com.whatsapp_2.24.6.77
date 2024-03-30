package X;

import android.content.Context;
import java.util.Objects;

/* renamed from: X.5gt  reason: invalid class name and case insensitive filesystem */
public final class C114235gt {
    public final C001600r A00;

    public C114235gt(Context context) {
        C001600r r0;
        Objects.requireNonNull(context);
        Objects.requireNonNull(context);
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            r0 = new C95414kt();
        } else {
            r0 = new C95424ku(context);
        }
        this.A00 = r0;
    }
}
