package X;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: X.0Ux  reason: invalid class name and case insensitive filesystem */
public abstract class C06750Ux {
    public int A00;
    public boolean A01;
    public final ComponentName A02;

    public void A00() {
    }

    public void A01() {
    }

    public void A02() {
    }

    public abstract void A04(Intent intent);

    public void A03(int i) {
        if (!this.A01) {
            this.A01 = true;
            this.A00 = i;
            return;
        }
        int i2 = this.A00;
        if (i2 != i) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Given job ID ");
            A0u.append(i);
            throw AnonymousClass000.A0d(" is different than previous ", A0u, i2);
        }
    }

    public C06750Ux(ComponentName componentName) {
        this.A02 = componentName;
    }
}
