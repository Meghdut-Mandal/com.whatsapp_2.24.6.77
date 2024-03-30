package X;

/* renamed from: X.6C6  reason: invalid class name */
public final class AnonymousClass6C6 {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6C6) {
                AnonymousClass6C6 r8 = (AnonymousClass6C6) obj;
                if (!(this.A00 == r8.A00 && this.A03 == r8.A03 && this.A01 == r8.A01 && this.A02 == r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A02, C36321k7.A00(this.A01, C36321k7.A00(this.A03, C90464aC.A08(this.A00))));
    }

    public AnonymousClass6C6(long j, long j2, long j3, long j4) {
        this.A00 = j;
        this.A03 = j2;
        this.A01 = j3;
        this.A02 = j4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GoogleBackupStats(mediaSize=");
        A0u.append(this.A00);
        A0u.append(", timestamp=");
        A0u.append(this.A03);
        A0u.append(", messageRowId=");
        A0u.append(this.A01);
        A0u.append(", premiumMessageRowId=");
        return C36331k8.A0j(A0u, this.A02);
    }
}
