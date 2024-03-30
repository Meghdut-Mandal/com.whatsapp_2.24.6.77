package X;

/* renamed from: X.6CC  reason: invalid class name */
public final class AnonymousClass6CC {
    public final AnonymousClass6DC A00;
    public final String A01;
    public final C1274568j A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6CC) {
                AnonymousClass6CC r5 = (AnonymousClass6CC) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A02, C36351kA.A05(this.A00, C36381kD.A08(this.A01, C36421kH.A04(this.A03)))) + 1231;
    }

    public AnonymousClass6CC(C1274568j r1, AnonymousClass6DC r2, String str, String str2) {
        this.A03 = str;
        this.A01 = str2;
        this.A00 = r2;
        this.A02 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MaskEffect(identifier=");
        C90494aF.A1N(A0u, "1001");
        A0u.append(this.A01);
        A0u.append(", bestInstance=");
        A0u.append(this.A00);
        A0u.append(", thumbnail=");
        A0u.append(this.A02);
        A0u.append(", isPersonalizedAvatar=");
        return C36321k7.A0H(A0u, true);
    }
}
