package X;

import android.graphics.Bitmap;

/* renamed from: X.4pn  reason: invalid class name and case insensitive filesystem */
public final class C97504pn extends C109495Xu {
    public final Bitmap A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C97504pn) {
                C97504pn r5 = (C97504pn) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36421kH.A04(this.A01));
    }

    public C97504pn(Bitmap bitmap, String str) {
        this.A01 = str;
        this.A00 = bitmap;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AiOutputBitmap(type=");
        A0u.append(this.A01);
        A0u.append(", bitmap=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
