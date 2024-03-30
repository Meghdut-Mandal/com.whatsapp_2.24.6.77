package X;

import android.os.Build;
import android.util.Property;

/* renamed from: X.0W5  reason: invalid class name */
public abstract class AnonymousClass0W5 {
    public static final Property A00 = new C18090sb(4);
    public static final Property A01 = new C18090sb(3);
    public static final AnonymousClass0V3 A02;

    static {
        AnonymousClass0V3 r0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            r0 = new AnonymousClass0IW();
        } else if (i >= 23) {
            r0 = new AnonymousClass0IX();
        } else if (i >= 22) {
            r0 = new AnonymousClass0IY();
        } else {
            r0 = new AnonymousClass0IZ();
        }
        A02 = r0;
    }
}
