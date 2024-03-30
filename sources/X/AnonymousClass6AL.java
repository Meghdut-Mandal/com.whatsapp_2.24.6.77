package X;

/* renamed from: X.6AL  reason: invalid class name */
public final class AnonymousClass6AL {
    public final C129166Fp A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6AL) {
                AnonymousClass6AL r5 = (AnonymousClass6AL) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public AnonymousClass6AL(C129166Fp r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PartialImageResult(downloadData=");
        A0u.append(this.A00);
        A0u.append(", stopped=");
        return C36321k7.A0H(A0u, this.A01);
    }
}
