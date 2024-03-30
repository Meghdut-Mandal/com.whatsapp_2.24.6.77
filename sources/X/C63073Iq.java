package X;

import android.graphics.Bitmap;

/* renamed from: X.3Iq  reason: invalid class name and case insensitive filesystem */
public final class C63073Iq {
    public final Bitmap A00;
    public final AnonymousClass3KU A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63073Iq) {
                C63073Iq r5 = (C63073Iq) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36391kE.A0A(this.A01) + AnonymousClass000.A0H(this.A00)) * 31) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public C63073Iq(Bitmap bitmap, AnonymousClass3KU r2, boolean z) {
        this.A01 = r2;
        this.A00 = bitmap;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AccountSwitcherBottomSheetRowModel(accountSwitchingModel=");
        A0u.append(this.A01);
        A0u.append(", profilePhoto=");
        A0u.append(this.A00);
        A0u.append(", isActiveAccount=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
