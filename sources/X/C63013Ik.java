package X;

import android.view.View;

/* renamed from: X.3Ik  reason: invalid class name and case insensitive filesystem */
public final class C63013Ik {
    public final View.OnClickListener A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63013Ik) {
                C63013Ik r5 = (C63013Ik) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36421kH.A04(this.A01) + AnonymousClass000.A0H(this.A00);
    }

    public C63013Ik(View.OnClickListener onClickListener, String str) {
        this.A01 = str;
        this.A00 = onClickListener;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ButtonSpec(buttonText=");
        A0u.append(this.A01);
        A0u.append(", clickListener=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
