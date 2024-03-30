package X;

import android.graphics.Bitmap;

/* renamed from: X.55D  reason: invalid class name */
public final class AnonymousClass55D extends C110615ax {
    public final Bitmap A00;
    public final C119575q5 A01;
    public final String A02;

    public AnonymousClass55D(Bitmap bitmap, C119575q5 r3, String str) {
        AnonymousClass00C.A0D(str, 1);
        this.A02 = str;
        this.A00 = bitmap;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass55D) {
                AnonymousClass55D r5 = (AnonymousClass55D) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, (C36421kH.A04(this.A02) + AnonymousClass000.A0H(this.A00)) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SearchExpressionsState(expressionsSearchVal=");
        A0u.append(this.A02);
        A0u.append(", dynamicAvatarIconBitmap=");
        A0u.append(this.A00);
        A0u.append(", selectedTab=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
