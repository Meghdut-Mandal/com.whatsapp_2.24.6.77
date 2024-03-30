package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.3lF  reason: invalid class name and case insensitive filesystem */
public final class C74213lF implements AnonymousClass4QR {
    public final int A00;

    public Drawable BBE(Context context) {
        AnonymousClass00C.A0D(context, 0);
        return C013105r.A01(context, this.A00);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C74213lF) && this.A00 == ((C74213lF) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C74213lF(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DrawableProviderImpl(resId=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
