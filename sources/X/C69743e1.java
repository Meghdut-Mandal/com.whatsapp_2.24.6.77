package X;

/* renamed from: X.3e1  reason: invalid class name and case insensitive filesystem */
public final class C69743e1 implements C16270ot {
    public final AnonymousClass141 A00;
    public final C63243Jh A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69743e1) {
                C69743e1 r5 = (C69743e1) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || this.A03 != r5.A03 || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36351kA.A05(this.A00, C36391kE.A0A(this.A01)) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public C69743e1(AnonymousClass141 r1, C63243Jh r2, boolean z, boolean z2) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = z;
        this.A02 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Contact(favorite=");
        A0u.append(this.A01);
        A0u.append(", waContact=");
        A0u.append(this.A00);
        A0u.append(", showVoiceChat=");
        A0u.append(this.A03);
        A0u.append(", editMode=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
