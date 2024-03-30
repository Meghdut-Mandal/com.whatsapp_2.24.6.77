package X;

import android.graphics.Bitmap;

/* renamed from: X.28w  reason: invalid class name and case insensitive filesystem */
public final class C430828w extends C53242r0 {
    public final Bitmap A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C430828w) && AnonymousClass00C.A0J(this.A00, ((C430828w) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C430828w(Bitmap bitmap) {
        this.A00 = bitmap;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DisplayBitmap(bitmap=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
