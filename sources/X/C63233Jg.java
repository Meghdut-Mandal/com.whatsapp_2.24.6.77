package X;

/* renamed from: X.3Jg  reason: invalid class name and case insensitive filesystem */
public final class C63233Jg {
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63233Jg) {
                C63233Jg r8 = (C63233Jg) obj;
                if (!AnonymousClass00C.A0J(this.A03, r8.A03) || !AnonymousClass00C.A0J(this.A02, r8.A02) || this.A00 != r8.A00 || this.A01 != r8.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A01, C36321k7.A00(this.A00, ((C36341k9.A09(this.A03) * 31) + C36421kH.A05(this.A02)) * 31));
    }

    public C63233Jg(long j, String str, long j2, String str2) {
        this.A03 = str;
        this.A02 = str2;
        this.A00 = j;
        this.A01 = j2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EvolvedAbout(textStatus=");
        A0u.append(this.A03);
        A0u.append(", emoji=");
        A0u.append(this.A02);
        A0u.append(", duration=");
        A0u.append(this.A00);
        A0u.append(", timestamp=");
        return C36331k8.A0j(A0u, this.A01);
    }
}
