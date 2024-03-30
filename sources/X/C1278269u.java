package X;

import android.graphics.Bitmap;

/* renamed from: X.69u  reason: invalid class name and case insensitive filesystem */
public final class C1278269u {
    public final int A00;
    public final Bitmap A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1278269u) {
                C1278269u r5 = (C1278269u) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + AnonymousClass000.A0H(this.A01);
    }

    public C1278269u(int i, Bitmap bitmap) {
        this.A00 = i;
        this.A01 = bitmap;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CallFailedBackgroundState(visibility=");
        A0u.append(this.A00);
        A0u.append(", bitmap=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
