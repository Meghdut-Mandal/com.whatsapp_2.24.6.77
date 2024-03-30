package X;

import android.view.View;

/* renamed from: X.3K5  reason: invalid class name */
public final class AnonymousClass3K5 {
    public int A00;
    public View A01;
    public View A02;
    public C51502nv A03;
    public AnonymousClass141 A04;
    public C61953Ed A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3K5) {
                AnonymousClass3K5 r5 = (AnonymousClass3K5) obj;
                if (this.A00 != r5.A00 || this.A03 != r5.A03 || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C36351kA.A05(this.A04, C36351kA.A05(this.A03, this.A00 * 31)) + AnonymousClass000.A0H(this.A02)) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + C36411kG.A09(this.A05);
    }

    public AnonymousClass3K5(View view, View view2, C51502nv r3, AnonymousClass141 r4, C61953Ed r5, int i) {
        this.A00 = i;
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = view;
        this.A01 = view2;
        this.A05 = r5;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ClickEvent(position=");
        A0u.append(this.A00);
        A0u.append(", clickedItem=");
        C36401kF.A1S(this.A03, A0u);
        A0u.append(this.A04);
        A0u.append(", transitionView=");
        A0u.append(this.A02);
        A0u.append(", containerView=");
        A0u.append(this.A01);
        A0u.append(", statusData=");
        return AnonymousClass000.A0m(this.A05, A0u);
    }
}
