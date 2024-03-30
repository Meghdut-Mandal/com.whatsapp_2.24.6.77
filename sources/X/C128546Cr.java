package X;

import android.view.View;

/* renamed from: X.6Cr  reason: invalid class name and case insensitive filesystem */
public final class C128546Cr {
    public final int A00;
    public final View.OnClickListener A01;
    public final View.OnClickListener A02;
    public final View.OnClickListener A03;
    public final boolean A04;

    public C128546Cr(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, int i, boolean z) {
        C36331k8.A1G(onClickListener, 3, onClickListener2);
        this.A04 = z;
        this.A00 = i;
        this.A01 = onClickListener;
        this.A03 = onClickListener2;
        this.A02 = onClickListener3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128546Cr) {
                C128546Cr r5 = (C128546Cr) obj;
                if (this.A04 != r5.A04 || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, C36351kA.A05(this.A03, C36351kA.A05(this.A01, ((C36341k9.A01(this.A04 ? 1 : 0) * 31) + this.A00) * 31)));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CallFailedScreenState(isVideoCall=");
        A0u.append(this.A04);
        A0u.append(", result=");
        A0u.append(this.A00);
        A0u.append(", cancelAction=");
        A0u.append(this.A01);
        A0u.append(", reRingAction=");
        A0u.append(this.A03);
        A0u.append(", messageAction=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
