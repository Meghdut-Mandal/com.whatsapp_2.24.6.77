package X;

/* renamed from: X.4jb  reason: invalid class name and case insensitive filesystem */
public final class C94984jb extends C137896gu {
    public static C94984jb A01;
    public static final Integer A02 = C023109s.A00;
    public static final Integer A03 = C023109s.A01;
    public AnonymousClass6FW A00;

    private final int A00(Integer num, int i) {
        AnonymousClass6FW r0 = this.A00;
        if (r0 == null) {
            throw C36331k8.A0d("layoutResult");
        }
        int A032 = r0.A03(i);
        AnonymousClass6FW r02 = this.A00;
        if (r02 == null) {
            throw C36331k8.A0d("layoutResult");
        }
        Integer A04 = r02.A04(A032);
        AnonymousClass6FW r03 = this.A00;
        if (num != A04) {
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
        if (C137896gu.A01(this) > 0 && i < C137896gu.A01(this)) {
            if (i < 0) {
                AnonymousClass6FW r1 = this.A00;
                if (r1 == null) {
                    throw C36331k8.A0d("layoutResult");
                }
                i2 = r1.A02(0);
            } else {
                AnonymousClass6FW r0 = this.A00;
                if (r0 == null) {
                    throw C36331k8.A0d("layoutResult");
                }
                i2 = r0.A02(i);
                if (A00(A03, i2) != i) {
                    i2++;
                }
            }
            AnonymousClass6FW r02 = this.A00;
            if (r02 == null) {
                throw C36331k8.A0d("layoutResult");
            } else if (i2 < r02.A03.A02) {
                return A03(A00(A03, i2), A00(A02, i2) + 1);
            }
        }
        return null;
    }

    public int[] Bm1(int i) {
        int i2;
        if (C137896gu.A01(this) > 0 && i > 0) {
            if (i > C137896gu.A01(this)) {
                AnonymousClass6FW r1 = this.A00;
                if (r1 == null) {
                    throw C36331k8.A0d("layoutResult");
                }
                i2 = r1.A02(C137896gu.A01(this));
            } else {
                AnonymousClass6FW r0 = this.A00;
                if (r0 == null) {
                    throw C36331k8.A0d("layoutResult");
                }
                i2 = r0.A02(i);
                if (A00(A02, i2) + 1 != i) {
                    i2--;
                }
            }
            if (i2 >= 0) {
                return A03(A00(A03, i2), A00(A02, i2) + 1);
            }
        }
        return null;
    }
}
