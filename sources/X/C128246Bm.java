package X;

/* renamed from: X.6Bm  reason: invalid class name and case insensitive filesystem */
public final class C128246Bm {
    public final float A00;
    public final float A01;
    public final C128006Am A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128246Bm) {
                C128246Bm r5 = (C128246Bm) obj;
                if (!(AnonymousClass00C.A0J(this.A02, r5.A02) && Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A00, r5.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90514aH.A0C(C90474aD.A02(C36391kE.A0A(this.A02), this.A01), this.A00);
    }

    public C128246Bm(C128006Am r1, float f, float f2) {
        this.A02 = r1;
        this.A01 = f;
        this.A00 = f2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StatusSize(size=");
        A0u.append(this.A02);
        A0u.append(", strokeWidth=");
        A0u.append(this.A01);
        A0u.append(", innerStrokeWidth=");
        return C90464aC.A0g(A0u, this.A00);
    }
}
