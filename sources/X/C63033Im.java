package X;

/* renamed from: X.3Im  reason: invalid class name and case insensitive filesystem */
public final class C63033Im {
    public final float A00;
    public final C62723Hh A01;
    public final C62723Hh A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63033Im) {
                C63033Im r5 = (C63033Im) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A02, C36391kE.A0A(this.A01)) + Float.floatToIntBits(this.A00);
    }

    public C63033Im(C62723Hh r1, C62723Hh r2, float f) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SplitInfo:{");
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("primaryActivityStack=");
        A0u2.append(this.A01);
        A0u2.append(',');
        C36351kA.A1K(A0u2, A0u);
        StringBuilder A0u3 = AnonymousClass000.A0u();
        A0u3.append("secondaryActivityStack=");
        A0u3.append(this.A02);
        A0u3.append(',');
        C36351kA.A1K(A0u3, A0u);
        StringBuilder A0u4 = AnonymousClass000.A0u();
        A0u4.append("splitRatio=");
        A0u4.append(this.A00);
        String A0q = AnonymousClass000.A0q(AnonymousClass000.A0s(A0u4), A0u);
        AnonymousClass00C.A08(A0q);
        return A0q;
    }
}
