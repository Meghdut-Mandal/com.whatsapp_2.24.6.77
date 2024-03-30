package X;

import android.graphics.PointF;
import android.view.View;

/* renamed from: X.0IK  reason: invalid class name */
public class AnonymousClass0IK extends AnonymousClass0I9 {
    public AnonymousClass0CY A00;
    public AnonymousClass0CY A01;

    public int[] A08(View view, AnonymousClass0CP r7) {
        int[] iArr = new int[2];
        if (r7.A1N()) {
            AnonymousClass0CY r1 = this.A00;
            if (r1 == null || r1.A02 != r7) {
                r1 = new C18180sk(r7, 0);
                this.A00 = r1;
            }
            iArr[0] = AnonymousClass0I9.A00(view, r1);
        } else {
            iArr[0] = 0;
        }
        if (r7.A1O()) {
            AnonymousClass0CY r12 = this.A01;
            if (r12 == null || r12.A02 != r7) {
                r12 = new C18180sk(r7, 1);
                this.A01 = r12;
            }
            iArr[1] = AnonymousClass0I9.A00(view, r12);
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public AnonymousClass0IE A05(AnonymousClass0CP r4) {
        if (!(r4 instanceof AnonymousClass0CQ)) {
            return null;
        }
        return new C18170sj(this.A01.getContext(), this, 0);
    }

    public int A03(AnonymousClass0CP r12, int i, int i2) {
        AnonymousClass0CY r9;
        PointF B3K;
        int A0M = r12.A0M();
        if (A0M != 0) {
            if (r12.A1O()) {
                r9 = this.A01;
                if (r9 == null || r9.A02 != r12) {
                    r9 = new C18180sk(r12, 1);
                    this.A01 = r9;
                }
            } else if (r12.A1N()) {
                r9 = this.A00;
                if (r9 == null || r9.A02 != r12) {
                    r9 = new C18180sk(r12, 0);
                    this.A00 = r9;
                }
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int A0L = r12.A0L();
            View view = null;
            View view2 = null;
            for (int i5 = 0; i5 < A0L; i5++) {
                View A0R = r12.A0R(i5);
                if (A0R != null) {
                    int A002 = AnonymousClass0I9.A00(A0R, r9);
                    if (A002 <= 0) {
                        if (A002 > i3) {
                            view2 = A0R;
                            i3 = A002;
                        }
                        if (A002 < 0) {
                        }
                    }
                    if (A002 < i4) {
                        view = A0R;
                        i4 = A002;
                    }
                }
            }
            boolean z = true;
            if (!r12.A1N() ? i2 <= 0 : i <= 0) {
                z = false;
                if (view2 != null) {
                    return AnonymousClass0CP.A02(view2);
                }
            } else if (view != null) {
                return AnonymousClass0CP.A02(view);
            } else {
                view = view2;
            }
            if (view != null) {
                int A02 = AnonymousClass0CP.A02(view);
                int A0M2 = r12.A0M();
                boolean z2 = false;
                if ((r12 instanceof AnonymousClass0CQ) && (B3K = ((AnonymousClass0CQ) r12).B3K(A0M2 - 1)) != null && (B3K.x < 0.0f || B3K.y < 0.0f)) {
                    z2 = true;
                }
                int i6 = 1;
                if (z2 == z) {
                    i6 = -1;
                }
                int i7 = A02 + i6;
                if (i7 < 0 || i7 >= A0M) {
                    return -1;
                }
                return i7;
            }
        }
        return -1;
    }

    public View A04(AnonymousClass0CP r10) {
        AnonymousClass0CY r7;
        if (r10.A1O()) {
            r7 = this.A01;
            if (r7 == null || r7.A02 != r10) {
                r7 = new C18180sk(r10, 1);
                this.A01 = r7;
            }
        } else if (!r10.A1N()) {
            return null;
        } else {
            r7 = this.A00;
            if (r7 == null || r7.A02 != r10) {
                r7 = new C18180sk(r10, 0);
                this.A00 = r7;
            }
        }
        int A0L = r10.A0L();
        View view = null;
        if (A0L == 0) {
            return null;
        }
        int A04 = r7.A04() + (r7.A05() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < A0L; i2++) {
            View A0R = r10.A0R(i2);
            int A05 = AnonymousClass000.A05(r7.A09(A0R) + (r7.A07(A0R) / 2), A04);
            if (A05 < i) {
                view = A0R;
                i = A05;
            }
        }
        return view;
    }
}
