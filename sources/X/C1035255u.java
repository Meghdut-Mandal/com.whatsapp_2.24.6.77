package X;

/* renamed from: X.55u  reason: invalid class name and case insensitive filesystem */
public final class C1035255u extends C1266865b {
    public final C125385zp A00;
    public final AnonymousClass6AC A01;
    public final String A02;

    public C1035255u(C125385zp r2, AnonymousClass6AC r3, String str) {
        AnonymousClass00C.A0D(str, 1);
        this.A02 = str;
        this.A01 = r3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1035255u) {
                C1035255u r5 = (C1035255u) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36351kA.A05(this.A01, C36421kH.A04(this.A02)));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ShapeSticker(id=");
        A0u.append(this.A02);
        A0u.append(", shape=");
        A0u.append(this.A01);
        A0u.append(", section=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
