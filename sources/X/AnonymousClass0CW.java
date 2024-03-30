package X;

import android.view.View;

/* renamed from: X.0CW  reason: invalid class name */
public class AnonymousClass0CW {
    public boolean A00;
    public int A01;
    public int A02;
    public AnonymousClass0CY A03;
    public boolean A04;

    public void A00() {
        this.A02 = -1;
        this.A01 = Integer.MIN_VALUE;
        this.A04 = false;
        this.A00 = false;
    }

    public void A01(View view, int i) {
        int A09;
        int A05;
        boolean z = this.A04;
        AnonymousClass0CY r0 = this.A03;
        if (z) {
            int A06 = r0.A06(view);
            AnonymousClass0CY r2 = this.A03;
            if (Integer.MIN_VALUE == r2.A00) {
                A05 = 0;
            } else {
                A05 = r2.A05() - r2.A00;
            }
            A09 = A06 + A05;
        } else {
            A09 = r0.A09(view);
        }
        this.A01 = A09;
        this.A02 = i;
    }

    public void A02(View view, int i) {
        int A05;
        int min;
        AnonymousClass0CY r2 = this.A03;
        if (Integer.MIN_VALUE == r2.A00 || (A05 = r2.A05() - r2.A00) >= 0) {
            A01(view, i);
            return;
        }
        this.A02 = i;
        boolean z = this.A04;
        AnonymousClass0CY r0 = this.A03;
        if (z) {
            int A022 = (r0.A02() - A05) - this.A03.A06(view);
            this.A01 = this.A03.A02() - A022;
            if (A022 > 0) {
                int A07 = this.A01 - this.A03.A07(view);
                int A042 = this.A03.A04();
                int min2 = A07 - (A042 + Math.min(this.A03.A09(view) - A042, 0));
                if (min2 < 0) {
                    min = this.A01 + Math.min(A022, -min2);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            int A09 = r0.A09(view);
            int A043 = A09 - this.A03.A04();
            this.A01 = A09;
            if (A043 > 0) {
                int A023 = (this.A03.A02() - Math.min(0, (this.A03.A02() - A05) - this.A03.A06(view))) - (A09 + this.A03.A07(view));
                if (A023 < 0) {
                    min = this.A01 - Math.min(A043, -A023);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.A01 = min;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AnchorInfo{mPosition=");
        sb.append(this.A02);
        sb.append(", mCoordinate=");
        sb.append(this.A01);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.A04);
        sb.append(", mValid=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }

    public AnonymousClass0CW() {
        A00();
    }
}
