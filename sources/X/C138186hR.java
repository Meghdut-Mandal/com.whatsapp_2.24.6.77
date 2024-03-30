package X;

/* renamed from: X.6hR  reason: invalid class name and case insensitive filesystem */
public final class C138186hR implements C161277mU {
    public final long A00;

    public C125185zS B8w() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C138186hR) {
                long j = this.A00;
                long j2 = ((C138186hR) obj).A00;
                long j3 = C133336Xx.A01;
                if (j == j2) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public float B8b() {
        return C133336Xx.A01(this.A00);
    }

    public int hashCode() {
        long j = this.A00;
        long j2 = C133336Xx.A01;
        return AnonymousClass000.A08(j);
    }

    public C138186hR(long j) {
        this.A00 = j;
        if (j == C133336Xx.A05) {
            throw AnonymousClass001.A08("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }

    public long B9t() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ColorStyle(value=");
        return AnonymousClass000.A0m(C133336Xx.A07(this.A00), A0u);
    }
}
