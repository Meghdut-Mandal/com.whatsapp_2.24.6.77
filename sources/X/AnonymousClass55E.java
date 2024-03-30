package X;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: X.55E  reason: invalid class name */
public final class AnonymousClass55E extends C110615ax {
    public final int A00;
    public final Bitmap A01;
    public final C119575q5 A02;
    public final List A03;
    public final boolean A04;

    public AnonymousClass55E(Bitmap bitmap, C119575q5 r3, List list, int i, boolean z) {
        AnonymousClass00C.A0D(list, 4);
        this.A02 = r3;
        this.A00 = i;
        this.A01 = bitmap;
        this.A03 = list;
        this.A04 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass55E) {
                AnonymousClass55E r5 = (AnonymousClass55E) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A03, r5.A03) || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A03, (((C36391kE.A0A(this.A02) + this.A00) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + C36341k9.A01(this.A04 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BrowserState(selectedTab=");
        A0u.append(this.A02);
        A0u.append(", selectedTabPosition=");
        A0u.append(this.A00);
        A0u.append(", dynamicAvatarIconBitmap=");
        A0u.append(this.A01);
        A0u.append(", tabs=");
        A0u.append(this.A03);
        A0u.append(", openKeyboard=");
        return C36321k7.A0H(A0u, this.A04);
    }
}
