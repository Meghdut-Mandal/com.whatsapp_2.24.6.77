package X;

import android.graphics.Rect;

/* renamed from: X.4jc  reason: invalid class name and case insensitive filesystem */
public final class C94994jc extends C137896gu {
    public static C94994jc A03;
    public static final Integer A04 = C023109s.A00;
    public static final Integer A05 = C023109s.A01;
    public AnonymousClass6WV A00;
    public AnonymousClass6FW A01;
    public Rect A02 = AnonymousClass001.A06();

    private final int A00(Integer num, int i) {
        AnonymousClass6FW r0 = this.A01;
        if (r0 == null) {
            throw C36331k8.A0d("layoutResult");
        }
        int A032 = r0.A03(i);
        AnonymousClass6FW r02 = this.A01;
        if (r02 == null) {
            throw C36331k8.A0d("layoutResult");
        }
        Integer A042 = r02.A04(A032);
        AnonymousClass6FW r03 = this.A01;
        if (num != A042) {
            if (r03 != null) {
                return r03.A03(i);
            }
            throw C36331k8.A0d("layoutResult");
        } else if (r03 != null) {
            return r03.A03.A01(i) - 1;
        } else {
            throw C36331k8.A0d("layoutResult");
        }
    }

    public int[] B7W(int i) {
        int i2;
        if (C137896gu.A01(this) <= 0 || i >= C137896gu.A01(this)) {
            return null;
        }
        try {
            AnonymousClass6WV r0 = this.A00;
            if (r0 == null) {
                throw C36331k8.A0d("node");
            }
            AnonymousClass6QC A042 = r0.A04();
            int A012 = C14960mT.A01(A042.A00 - A042.A03);
            int i3 = 0;
            if (0 < i) {
                i3 = i;
            }
            AnonymousClass6FW r02 = this.A01;
            if (r02 == null) {
                throw C36331k8.A0d("layoutResult");
            }
            int A022 = r02.A02(i3);
            AnonymousClass6FW r03 = this.A01;
            if (r03 == null) {
                throw C36331k8.A0d("layoutResult");
            }
            float A002 = r03.A00(A022) + ((float) A012);
            AnonymousClass6FW r1 = this.A01;
            if (r1 == null) {
                throw C36331k8.A0d("layoutResult");
            }
            int i4 = (A002 > r1.A00(r1.A03.A02 - 1) ? 1 : (A002 == r1.A00(r1.A03.A02 - 1) ? 0 : -1));
            AnonymousClass6FW r04 = this.A01;
            if (i4 < 0) {
                if (r04 == null) {
                    throw C36331k8.A0d("layoutResult");
                }
                i2 = r04.A01(A002);
            } else if (r04 == null) {
                throw C36331k8.A0d("layoutResult");
            } else {
                i2 = r04.A03.A02;
            }
            return A03(i3, A00(A04, i2 - 1) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public int[] Bm1(int i) {
        int i2;
        if (C137896gu.A01(this) <= 0 || i <= 0) {
            return null;
        }
        try {
            AnonymousClass6WV r0 = this.A00;
            if (r0 == null) {
                throw C36331k8.A0d("node");
            }
            AnonymousClass6QC A042 = r0.A04();
            int A012 = C14960mT.A01(A042.A00 - A042.A03);
            int A013 = C137896gu.A01(this);
            if (A013 > i) {
                A013 = i;
            }
            AnonymousClass6FW r02 = this.A01;
            if (r02 == null) {
                throw C36331k8.A0d("layoutResult");
            }
            int A022 = r02.A02(A013);
            AnonymousClass6FW r03 = this.A01;
            if (r03 == null) {
                throw C36331k8.A0d("layoutResult");
            }
            float A002 = r03.A00(A022) - ((float) A012);
            if (A002 > 0.0f) {
                AnonymousClass6FW r04 = this.A01;
                if (r04 == null) {
                    throw C36331k8.A0d("layoutResult");
                }
                i2 = r04.A01(A002);
            } else {
                i2 = 0;
            }
            if (A013 == C137896gu.A01(this) && i2 < A022) {
                i2++;
            }
            return A03(A00(A05, i2), A013);
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}
