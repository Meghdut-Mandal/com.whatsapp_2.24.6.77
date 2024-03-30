package X;

/* renamed from: X.9WU  reason: invalid class name */
public final class AnonymousClass9WU {
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass9WU r7 = (AnonymousClass9WU) obj;
            if (!(this.A02 == r7.A02 && this.A01 == r7.A01 && this.A03.equals(r7.A03))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A0B = C90504aG.A0B(this.A03, (((527 + ((int) this.A02)) * 31) + ((int) this.A01)) * 31);
        this.A00 = A0B;
        return A0B;
    }

    public AnonymousClass9WU(long j, String str, long j2) {
        this.A03 = str == null ? "" : str;
        this.A02 = j;
        this.A01 = j2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RangedUri(referenceUri=");
        A0u.append(this.A03);
        A0u.append(", start=");
        A0u.append(this.A02);
        A0u.append(", length=");
        A0u.append(this.A01);
        return C90474aD.A0f(A0u);
    }
}
