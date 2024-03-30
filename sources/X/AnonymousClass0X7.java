package X;

import android.os.Build;
import android.os.Bundle;

/* renamed from: X.0X7  reason: invalid class name */
public class AnonymousClass0X7 {
    public final Object A00;

    public C07650Ys A00(int i) {
        return null;
    }

    public C07650Ys A01(int i) {
        return null;
    }

    public boolean A02(int i, int i2, Bundle bundle) {
        return false;
    }

    public AnonymousClass0X7(Object obj) {
        this.A00 = obj;
    }

    public AnonymousClass0X7() {
        Object r0;
        if (Build.VERSION.SDK_INT >= 26) {
            r0 = new AnonymousClass0H5(this);
        } else {
            r0 = new AnonymousClass0H6(this);
        }
        this.A00 = r0;
    }
}
