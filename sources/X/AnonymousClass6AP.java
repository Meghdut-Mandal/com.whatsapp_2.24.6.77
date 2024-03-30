package X;

/* renamed from: X.6AP  reason: invalid class name */
public final class AnonymousClass6AP {
    public final long A00;
    public final AnonymousClass011 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6AP) {
                AnonymousClass6AP r8 = (AnonymousClass6AP) obj;
                if (!AnonymousClass00C.A0J(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A00, C36391kE.A0A(this.A01));
    }

    public AnonymousClass6AP(AnonymousClass011 r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VideoEstimate(videoHeightWidth=");
        A0u.append(this.A01);
        A0u.append(", videoSize=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
