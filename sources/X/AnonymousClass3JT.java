package X;

/* renamed from: X.3JT  reason: invalid class name */
public final class AnonymousClass3JT {
    public final long A00;
    public final long A01;
    public final long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3JT) {
                AnonymousClass3JT r8 = (AnonymousClass3JT) obj;
                if (!(this.A02 == r8.A02 && this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A01, C36321k7.A00(this.A00, AnonymousClass000.A08(this.A02) * 31));
    }

    public AnonymousClass3JT(long j, long j2, long j3) {
        this.A02 = j;
        this.A00 = j2;
        this.A01 = j3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SessionDuration(sessionTotalTime=");
        A0u.append(this.A02);
        A0u.append(", sessionBackgroundTime=");
        A0u.append(this.A00);
        A0u.append(", sessionForegroundTime=");
        return C36331k8.A0j(A0u, this.A01);
    }
}
