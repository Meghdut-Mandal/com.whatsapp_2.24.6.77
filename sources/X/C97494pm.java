package X;

import android.graphics.Bitmap;

/* renamed from: X.4pm  reason: invalid class name and case insensitive filesystem */
public final class C97494pm extends C109485Xt {
    public final Bitmap A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C97494pm) && AnonymousClass00C.A0J(this.A00, ((C97494pm) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C97494pm(Bitmap bitmap) {
        this.A00 = bitmap;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AiInputBitmap(bitmap=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
