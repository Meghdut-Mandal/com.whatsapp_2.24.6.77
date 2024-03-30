package X;

import android.graphics.Bitmap;

/* renamed from: X.4xU  reason: invalid class name and case insensitive filesystem */
public final class C101394xU extends C101414xW {
    public final int A00;
    public final Bitmap A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C101394xU) {
                C101394xU r5 = (C101394xU) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || this.A03 != r5.A03 || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C36391kE.A0A(this.A01) + C36341k9.A09(this.A02)) * 31) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + this.A00;
    }

    public C101394xU(Bitmap bitmap, String str, int i, boolean z) {
        this.A01 = bitmap;
        this.A02 = str;
        this.A03 = z;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Data(bitmap=");
        A0u.append(this.A01);
        A0u.append(", emojis=");
        A0u.append(this.A02);
        A0u.append(", isSelected=");
        A0u.append(this.A03);
        A0u.append(", ringColor=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
